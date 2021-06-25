package com.citi.trade.service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import com.citi.trade.model.StockDetails;
import com.citi.trade.util.SectorCompanyList;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;

@Service
public class DashBoardService {
	

	Map<String, List<String>> sectorWiseCompanies = SectorCompanyList.sectorWiseCompany();

    public List<StockDetails> getPriceShockers() {

        List<StockDetails> priceShockers = new ArrayList<>();
        Set<String> sectorList = sectorWiseCompanies.keySet();
        try {
            sectorList.forEach(sector -> {
                List<String> companyList = new ArrayList<>(sectorWiseCompanies.get(sector));
                String[] tmpStockList = new String[companyList.size()];
                for (int i = 0; i < companyList.size(); i++) {
                    tmpStockList[i] = companyList.get(i);

                }
                try {
                    Map<String, Stock> stocks = YahooFinance.get(tmpStockList);
                    List<Stock> apiStockData = new ArrayList<>(stocks.values());
                    if (!ObjectUtils.isEmpty(apiStockData)) {
                        apiStockData.forEach(stock -> {
                            StockDetails stockDetails = new StockDetails();
                            stockDetails.setCompanyName(stock.getName());
                            stockDetails.setCurrentPrice(stock.getQuote().getPrice());
                            stockDetails.setPercentageChange(stock.getQuote().getChangeInPercent());
                            stockDetails.setSector(sector);
                            priceShockers.add(stockDetails);

                        });
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });


            if (!priceShockers.isEmpty()) priceShockers.sort((s1, s2) -> {
                if (s1 != null && s2 != null && s1.getPercentageChange() != null && s2.getPercentageChange() != null)
                    return s2.getPercentageChange().compareTo(s1.getPercentageChange());
                else
                    return 0;
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return priceShockers;
    }



    public List<StockDetails> getVolumeShokers() {

        List<StockDetails> volumeShockers = new ArrayList<>();
        Set<String> sectorList = sectorWiseCompanies.keySet();
        try {
            sectorList.forEach(sector -> {
                List<String> companyList = new ArrayList<>(sectorWiseCompanies.get(sector));
                String[] tmpStockList = new String[companyList.size()];
                for (int i = 0; i < companyList.size(); i++) {
                    tmpStockList[i] = companyList.get(i);

                }
                Map<String, Stock> stocks;

                try {
                    stocks = YahooFinance.get(tmpStockList);
                    List<Stock> apiStockData = new ArrayList<>(stocks.values());
                    if (!ObjectUtils.isEmpty(apiStockData)) {
                        apiStockData.forEach(stock -> {
                            StockDetails stockDetails = new StockDetails();
                            stockDetails.setCompanyName(stock.getName());
                            stockDetails.setVolume(stock.getQuote().getVolume());
                            stockDetails.setSector(sector);
                            volumeShockers.add(stockDetails);
                        });
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });


            if (!volumeShockers.isEmpty()) volumeShockers.sort((s1, s2) -> {
                if (s1 != null && s2 != null && s1.getVolume() != null && s2.getVolume() != null)
                    return s2.getVolume().compareTo(s1.getVolume());
                else
                    return 0;
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        return volumeShockers;

    }

    public List<HistoricalQuote> getTopGainer() {
        List<StockDetails> topGainer = new ArrayList<>();
        Set<String> sectorList = sectorWiseCompanies.keySet();
        int noofWeeks = -2; // two weeks
        Calendar from = Calendar.getInstance();
        Calendar to = Calendar.getInstance();
        from.add(Calendar.WEEK_OF_MONTH, noofWeeks);
        sectorList.forEach(sector -> {
            List<String> companyList = new ArrayList<>(sectorWiseCompanies.get(sector));
            String[] tmp = new String[companyList.size()];
            for (int i = 0; i < companyList.size(); i++) {
                tmp[i] = companyList.get(i);

            }
            Map<String, Stock> stocks;
            try {
                stocks = YahooFinance.get(tmp);
                List<Stock> apiStockData = new ArrayList<>(stocks.values());
                if (!ObjectUtils.isEmpty(apiStockData)) {
                    apiStockData.forEach(stock -> {
                        StockDetails stockDetails = new StockDetails();
                        stockDetails.setCompanyName(stock.getName());
                        stockDetails.setCurrentPrice(stock.getQuote().getPrice());
                        stockDetails.setSector(sector);
                        stockDetails.setSymbol(stock.getSymbol());
                        topGainer.add(stockDetails);
                    });
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        if (!topGainer.isEmpty()) {
            topGainer.sort((s1, s2) -> {
                if (s1 != null && s2 != null && s1.getCurrentPrice() != null && s2.getCurrentPrice() != null)
                    return s2.getCurrentPrice().compareTo(s1.getCurrentPrice());
                else
                    return 0;
            });
        }
        String topGainerCompanySymbol = topGainer.get(0).getSymbol();

        List<HistoricalQuote> historyOfTopGainer = new ArrayList<>();
        try {
        	Stock topGainerCompanyName = YahooFinance.get(topGainerCompanySymbol);
            historyOfTopGainer = topGainerCompanyName.getHistory(from, to, Interval.DAILY);
        } catch (IOException e) {

        }
        return historyOfTopGainer;
    }
	
}

