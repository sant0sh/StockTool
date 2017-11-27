package com.nasdaq.main;

import com.nasdaq.impl.Stock;

public class StockInfo {
	
	public static void main(String[] args) {
		
		// Instantiate stocks
		Stock ibm = new Stock("IBM");
		Stock amazon = new Stock("Amazon");
		Stock tesla = new Stock("Tesla");
		Stock google = new Stock("Google");
		Stock yahoo = new Stock("Yahoo!");
		
		// Display stock trends
		ibm.displayTrend();
		amazon.displayTrend();
		tesla.displayTrend();
		google.displayTrend();
		yahoo.displayTrend();

	}
}
