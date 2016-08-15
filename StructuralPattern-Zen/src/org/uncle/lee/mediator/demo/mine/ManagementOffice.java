package org.uncle.lee.mediator.demo.mine;

public interface ManagementOffice {
	public enum RequestCode{
		addRequest, deleteRequest;
	}
	
	public abstract void setPurchase(Purchase purchase);
	public abstract void setSlaes(Sales sales);
	public abstract Sales getSlaes();
	public abstract void setStock(Stock stock);
	public abstract void request(RequestCode requestCode, int stockNumber);
	public abstract void init();
}
