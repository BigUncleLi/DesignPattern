package org.uncle.lee.mediator.demo.mine;

import org.uncle.lee.utils.LogUtils;

public class ManagermentOfficeImpl implements ManagementOffice{
	private static final String TAG = ManagermentOfficeImpl.class.getSimpleName();
	private Purchase purchase;
	private Slaes sales;
	private Stock stock;
	
	@Override
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	@Override
	public void setSlaes(Slaes sales) {
		this.sales = sales;
	}

	@Override
	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void startPurchase() {
		LogUtils.d(TAG, "init and startPurchase");
		purchase.normalPurchase();
	}

	@Override
	public void sale(int saleNumber) {
		LogUtils.d(TAG, "sale : " + saleNumber);
		sales.sale(saleNumber);
	}

	@Override
	public void request(RequestCode requestCode, int stockNumber) {
		LogUtils.d(TAG, "handle request : " + requestCode.toString() + "-" + stockNumber);
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
}
