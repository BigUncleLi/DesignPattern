package org.uncle.lee.mediator.demo.mine;

import org.uncle.lee.utils.LogUtils;

public class SalesFactory {
	private static final String TAG = SalesFactory.class.getSimpleName();
	private SalesFactory(){}
	
	public static Sales createSlaes(){
		ManagementOffice managementOffice = createManagementOffice();
		return managementOffice.getSlaes();
	}

	private static ManagementOffice createManagementOffice() {
		LogUtils.d(TAG, "createManagementOffice");
		ManagementOffice managementOffice = new ManagermentOfficeImpl();
		managementOffice.setPurchase(createPurchase(managementOffice));
		managementOffice.setSlaes(createSlaes(managementOffice));
		managementOffice.setStock(createStock(managementOffice));
		managementOffice.init();
		return managementOffice;
	}
	
	private static Purchase createPurchase(ManagementOffice managementOffice) {
		LogUtils.d(TAG, "createPurchase");
		Purchase purchase = new Purchase();
		purchase.setManagerOffice(managementOffice);
		return purchase;
	}

	private static Sales createSlaes(ManagementOffice managementOffice) {
		LogUtils.d(TAG, "createSlaes");
		Sales slaes = new Sales();
		slaes.setManagerOffice(managementOffice);
		return slaes;
	}

	private static Stock createStock(ManagementOffice managementOffice) {
		LogUtils.d(TAG, "createStock");
		return new Stock();
	}
}
