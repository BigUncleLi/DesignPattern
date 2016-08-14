package org.uncle.lee.mediator.demo.mine;

public interface ManagementOffice {
	public abstract void setPurchase(Purchase purchase);
	public abstract void setSlaes(Slaes sales);
	public abstract void setStock(Stock stock);
	public abstract void startPurchase();
	public abstract void sale(int saleNumber);
}
