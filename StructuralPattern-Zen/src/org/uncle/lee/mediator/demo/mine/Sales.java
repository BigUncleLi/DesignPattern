package org.uncle.lee.mediator.demo.mine;

import org.uncle.lee.mediator.demo.mine.ManagementOffice.RequestCode;
import org.uncle.lee.utils.LogUtils;

public class Sales {
	private static final String TAG = Sales.class.getSimpleName();
	private ManagementOffice managementOffice;
	
	public void setManagerOffice(ManagementOffice managementOffice){
		this.managementOffice = managementOffice;
	}
	
	public void sale(int saleNumber){
		requestDeleteStock(saleNumber);
	}
	
	private void requestDeleteStock(int saleNumber){
		LogUtils.d(TAG, "requestDeleteStock : " + saleNumber);
		managementOffice.request(RequestCode.deleteRequest, saleNumber);
	}
}
