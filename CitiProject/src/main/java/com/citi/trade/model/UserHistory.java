package com.citi.trade.model;
import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Table(name =  "UserHistory", uniqueConstraints = @UniqueConstraint(columnNames = "userId"))
@Data
@AllArgsConstructor
public class UserHistory {
	
	@Id @Column(name = "userId")
	long userId;
	
	public UserHistory() {
		super();
	}

	@Column(name = "userName")
	String userName; 

	@Column(name = "sector")
	String sector; 

	@Column(name = "stockName")
	String stockName;
	
	@Column(name = "currentPrices")
	BigDecimal currentPrices;
	
	@Column(name = "buyPrice")
	BigDecimal buyPrice;
	
	@Column(name="profit_loss")
	BigDecimal profitLoss;
	
	@Column(name = "quantity")
	int quantity;
	
	

	
	
	
	
	

}
