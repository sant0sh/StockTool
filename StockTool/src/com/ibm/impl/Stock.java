package com.ibm.impl;

import com.ibm.interfaces.StockProperties;

public class Stock implements StockProperties {

	private String stockName;
	private int stockInfo;
	
	public Stock(String stockName) {
		this.stockName=stockName;
		stockInfo=(int) Math.round(Math.random());
	}
	
	public void displayTrend()
	{
		if (stockInfo == 1)
		{
			System.out.println(stockName + " is bullish.");
		}
		else if (stockInfo == 0)
		{
			System.out.println(stockName + " is bearish.");
		}
		
	}
}
