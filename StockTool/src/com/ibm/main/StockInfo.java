package com.ibm.main;

import com.ibm.impl.Stock;

public class StockInfo {
	
	public static void main(String[] args) {
		
		// Instantiate stocks
		Stock ibm = new Stock("IBM");
		Stock infosys = new Stock("Infosys");
		Stock wipro = new Stock("Wipro");
		Stock icici = new Stock("ICICI");
		
		// Display stock trends
		ibm.displayTrend();
		infosys.displayTrend();
		wipro.displayTrend();
		icici.displayTrend();

	}
}
