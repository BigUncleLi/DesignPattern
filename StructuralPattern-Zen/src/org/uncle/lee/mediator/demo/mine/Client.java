package org.uncle.lee.mediator.demo.mine;

public class Client {
	private static final int SALE_NUMBER_LITTLE = 1;
	private static final int SALE_NUMBER_MUCH = 100;

	public static void main(String[] args) {
		Sales sales = SalesFactory.createSlaes();

		saleDemo(sales);
		saleMoreDemo(sales);
	}

	private static void saleDemo(Sales sales) {
		sales.sale(SALE_NUMBER_LITTLE);
	}
	
	private static void saleMoreDemo(Sales sales) {
		sales.sale(SALE_NUMBER_MUCH);
	}
}
