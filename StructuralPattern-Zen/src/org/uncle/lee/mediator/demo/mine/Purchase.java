package org.uncle.lee.mediator.demo.mine;

import org.uncle.lee.mediator.demo.mine.ManagementOffice.RequestCode;
import org.uncle.lee.utils.LogUtils;

public class Purchase {
	private static final String TAG = Purchase.class.getSimpleName();
	private static final int NORMAL_PURCHASE_NUMBER = 10;
	private static final int URGENT_PURCHASE_NUMBER = NORMAL_PURCHASE_NUMBER * 3;
	private ManagementOffice managementOffice;
	
	public void setManagerOffice(ManagementOffice managementOffice){
		this.managementOffice = managementOffice;
	}
	
	public void normalPurchase(){
		LogUtils.d(TAG, "normalPurchase : " + NORMAL_PURCHASE_NUMBER);
		requestAddStock(NORMAL_PURCHASE_NUMBER);
	}
	
	public void urgentPurchase(){
		requestAddStock(URGENT_PURCHASE_NUMBER);
	}
	
	public void purchase(int purchaseNumber){
		requestAddStock(purchaseNumber);
	}
	
	private void requestAddStock(int addStock){
		LogUtils.d(TAG, "requestAddStock : " + addStock);
		managementOffice.request(RequestCode.addRequest, addStock);
	}
}
