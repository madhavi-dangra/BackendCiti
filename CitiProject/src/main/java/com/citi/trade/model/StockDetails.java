package com.citi.trade.model;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class StockDetails {


	private Long volume;
	private BigDecimal marketCap;
	private BigDecimal currentPrice;
	private BigDecimal growth;
	private BigDecimal pe;
	private BigDecimal eps ; //Earnings Per Share	
	private String companyName;
	private String sector;
	private String symbol;
	private BigDecimal high;
	private BigDecimal low;
	private BigDecimal close;
	private BigDecimal open;
	private BigDecimal percentageChange;
	private BigDecimal bidPrice;
	private BigDecimal MovingAverage;


	public BigDecimal getMovingAverage() {
		return MovingAverage;
	}
	public void setMovingAverage(BigDecimal movingAverage) {
		MovingAverage = movingAverage;
	}
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}
	public BigDecimal getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(BigDecimal marketCap) {
		this.marketCap = marketCap;
	}
	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}
	public BigDecimal getGrowth() {
		return growth;
	}
	public void setGrowth(BigDecimal growth) {
		this.growth = growth;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public BigDecimal getHigh() {
		return high;
	}
	public void setHigh(BigDecimal high) {
		this.high = high;
	}
	public BigDecimal getLow() {
		return low;
	}
	public void setLow(BigDecimal low) {
		this.low = low;
	}
	public BigDecimal getClose() {
		return close;
	}
	public void setClose(BigDecimal close) {
		this.close = close;
	}
	public BigDecimal getOpen() {
		return open;
	}
	public void setOpen(BigDecimal open) {
		this.open = open;
	}
	public BigDecimal getPercentageChange() {
		return percentageChange;
	}
	public void setPercentageChange(BigDecimal percentageChange) {
		this.percentageChange = percentageChange;
	}
	public BigDecimal getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(BigDecimal bidPrice) {
		this.bidPrice = bidPrice;
	}

	public BigDecimal getPe() {
		return pe;
	}
	public void setPe(BigDecimal pe) {
		this.pe = pe;
	}
	public BigDecimal getEps() {
		return eps;
	}
	public void setEps(BigDecimal eps) {
		this.eps = eps;
	}


}
