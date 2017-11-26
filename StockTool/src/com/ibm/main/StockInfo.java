package com.ibm.main;

import com.ibm.impl.Stock;

public class StockInfo {
	
	public static void main(String[] args) {
		
		Stock ibm = new Stock("IBM");
		Stock infosys = new Stock("Infosys");
		Stock wipro = new Stock("Wipro");
		Stock icici = new Stock("ICICI");
		
		ibm.displayTrend();
		infosys.displayTrend();
		wipro.displayTrend();
		icici.displayTrend();

	}
}
