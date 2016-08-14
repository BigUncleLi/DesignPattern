package org.uncle.lee.mediator.demo.mine;

public class Client {
	private static final int SALE_NUMBER_LITTLE = 1;

	public static void main(String[] args) {
		ManagementOffice managementOffice = createManagementOffice();
		managementOfficeInit(managementOffice);

		saleDemo(managementOffice);
	}

	private static ManagementOffice createManagementOffice() {
		ManagementOffice managementOffice = new ManagermentOfficeImpl();
		managementOffice.setPurchase(createPurchase(managementOffice));
		managementOffice.setSlaes(createSlaes(managementOffice));
		managementOffice.setStock(createStock(managementOffice));
		return managementOffice;
	}

	private static Purchase createPurchase(ManagementOffice managementOffice) {
		Purchase purchase = new Purchase();
		purchase.setManagerOffice(managementOffice);
		return purchase;
	}

	private static Slaes createSlaes(ManagementOffice managementOffice) {
		Slaes slaes = new Slaes();
		slaes.setManagerOffice(managementOffice);
		return slaes;
	}

	private static Stock createStock(ManagementOffice managementOffice) {
		return new Stock();
	}

	private static void managementOfficeInit(ManagementOffice managementOffice) {
		managementOffice.startPurchase();
	}

	private static void saleDemo(ManagementOffice managementOffice) {
		managementOffice.sale(SALE_NUMBER_LITTLE);
	}
}
