package org.uncle.lee.strategy.demo.enums;

public enum IntCalculate {
	add{
		@Override
		public int execute(int a, int b) {
			return a + b;
		}
	},
	
	delete{
		@Override
		public int execute(int a, int b) {
			return a - b;
		}
	};
	
	public abstract int execute(int a, int b);
}
