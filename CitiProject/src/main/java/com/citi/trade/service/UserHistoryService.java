package com.citi.trade.service;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.citi.trade.model.UserHistory;
import com.citi.trade.repository.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@Service
public class UserHistoryService {

	@Autowired
    private UserHistoryRepository repository;
	
		
	
	
	public UserHistoryService() {
    }

    public UserHistory saveUserHistory(UserHistory s) {
        return repository.save(s);
    }

    public List<UserHistory> getSavedStocks(String userName) {
        return repository.findByUserName(userName);
    }

    public List<UserHistory> getAllSavedStocksById(long user_id)
    {
    	return repository.findByUserId(user_id);
    }
    
    public List<UserHistory> getAllSavedStocks()
    {
    	return repository.findAll();
    }
    
    
}
