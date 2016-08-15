package org.uncle.lee.mediator.demo.mine;

import org.uncle.lee.utils.LogUtils;

public class ManagermentOfficeImpl implements ManagementOffice{
	private static final String TAG = ManagermentOfficeImpl.class.getSimpleName();
	private Purchase purchase;
	private Sales sales;
	private Stock stock;
	
	@Override
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	@Override
	public void setSlaes(Sales sales) {
		this.sales = sales;
	}
	
	@Override
	public Sales getSlaes() {
		return sales;
	}

	@Override
	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void request(RequestCode requestCode, int stockNumber) {
		LogUtils.d(TAG, "handle "  + requestCode.toString() + " request : " + stockNumber);
		if(RequestCode.addRequest.equals(requestCode)){
			requestAddStock(stockNumber);
		}else if(RequestCode.deleteRequest.equals(requestCode)){
			requestDeleteStock(stockNumber);
		}else {
			throw new IllegalArgumentException("Illegal request code");
		}
	}
	
	private void requestAddStock(int addStock) {
		stock.addStockNumber(addStock);
	}

	private void requestDeleteStock(int deleteStock) {
		stock.deleteStockNumber(deleteStock);
	}

	@Override
	public void init() {
		LogUtils.d(TAG, "init");
		startPurchase();
	}
	
	private void startPurchase() {
		LogUtils.d(TAG, "startPurchase");
		purchase.normalPurchase();
	}
}
