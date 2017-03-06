package org.uncle.lee.observer.demo.my;


public class Client {
	public static void main(String[] args) {
		HanFeiZi hanFeiZi = new HanFeiZiImpl();
		injectSpe(hanFeiZi);
		
		invoke(hanFeiZi);
	}

	private static void injectSpe(HanFeiZi hanFeiZi) {
		LiSi lisi = new LiSi();
		lisi.injectSpe(hanFeiZi);
	}
	
	private static void invoke(HanFeiZi hanFeiZi) {
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}
}
