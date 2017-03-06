package org.uncle.lee.mediator;

import org.uncle.lee.utils.LogUtils;

public class ConcreteMediator extends Mediator {
	private static final String TAG = ConcreteMediator.class.getSimpleName();
	
	@Override
	public void transport(Colleague colleague, String message) {
		TransportType type = setTargetColleague(colleague);
		showMessage(type, message);
	}

	private TransportType setTargetColleague(Colleague colleague) {
		if(colleague instanceof ConcreteColleagueA){
			super.setColleagueA(colleague);
			return TransportType.TYPE_B2A;
		}else if(colleague instanceof ConcreteColleagueB){
			super.setColleagueB(colleague);
			return TransportType.TYPE_A2B;
		}else {
			throw new IllegalArgumentException("error colleague argument");
		}
	}
	
	private void showMessage(TransportType type, String message) {
		LogUtils.d(TAG, "type is : " + type.getStrType() + " | content is : " + message);
	}
}
