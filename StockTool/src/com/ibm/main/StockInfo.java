package com.ibm.main;

import com.ibm.impl.Stock;

public class StockInfo {
	
	public static void main(String[] args) {
		Stock ibm = new Stock("IBM", 1);
		Stock infosys = new Stock("Infosys", 1);
		Stock wipro = new Stock("Wipro", 0);
		
		ibm.displayInfo();
		infosys.displayInfo();
		wipro.displayInfo();

	}
}
