package com.ibm.impl;

import com.ibm.StockProperties;

public class Stock implements StockProperties {

	String stockName;
	int stockInfo=0;
	
	public Stock(String stockName, int stockInfo) {
		this.stockName=stockName;
		this.stockInfo=stockInfo;
	}
	
	public void displayInfo()
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
