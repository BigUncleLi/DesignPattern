package org.uncle.lee.mediator.demo;

import java.util.Timer;
import java.util.TimerTask;

import org.uncle.lee.mediator.demo.ManagementOffice.RequestCode;
import org.uncle.lee.utils.LogUtils;

public class Purchase {
	private static final String TAG = Purchase.class.getSimpleName();
	private static final int NORMAL_PURCHASE_NUMBER = 10;
	private static final int URGENT_PURCHASE_NUMBER = NORMAL_PURCHASE_NUMBER * 3;
	private static final int NORMAL_PURCHASE_CYCLE = 1000 * 3;
	private static final int URGENT_PURCHASE_CYCLE = 1000 * 2;
	private static final String NORMAL_PURCHASE_RUNNABLE_NAME = "normalPurchaseTask"; 
	private static final String URGENT_PURCHASE_RUNNABLE_NAME = "urgentPurechaseTask";
	
	private ManagementOffice managementOffice;
	private Timer normalPurchaseTimer = new Timer(NORMAL_PURCHASE_RUNNABLE_NAME);;
	private Timer urgentPurchaseTimer = new Timer(URGENT_PURCHASE_RUNNABLE_NAME);;
	
	public void setManagerOffice(ManagementOffice managementOffice){
		this.managementOffice = managementOffice;
	}
	
	public void startNormalPurchase(){
		LogUtils.d(TAG, "start normalPurchase");
		stopUrgentPurchase();
		normalPurchaseTimer = new Timer(NORMAL_PURCHASE_RUNNABLE_NAME);
		normalPurchaseTimer.schedule(normalPurchaseTimerTask, 0, NORMAL_PURCHASE_CYCLE);
	}
	
	private TimerTask normalPurchaseTimerTask = new TimerTask() {
		@Override
		public void run() {
			requestAddStock(NORMAL_PURCHASE_NUMBER);
		}
	};
	
	private void stopNormalPurechase(){
		normalPurchaseTimer.cancel();
	}
	
	public void startUrgentPurchase(){
		LogUtils.d(TAG, "start urgentPurchase");
		stopNormalPurechase();
		urgentPurchaseTimer = new Timer(URGENT_PURCHASE_RUNNABLE_NAME);
		urgentPurchaseTimer.schedule(urgentPurchaseTimerTask, 0, URGENT_PURCHASE_CYCLE);
	}
	
	private TimerTask urgentPurchaseTimerTask = new TimerTask() {
		@Override
		public void run() {
			requestAddStock(URGENT_PURCHASE_NUMBER);
		}
	};

	
	private void stopUrgentPurchase(){
		urgentPurchaseTimer.cancel();
	}
	
	public void purchase(int purchaseNumber){
		requestAddStock(purchaseNumber);
	}
	
	private void requestAddStock(int addStock){
		LogUtils.d(TAG, "requestAddStock : " + addStock);
		managementOffice.request(RequestCode.addRequest, addStock);
	}
}
