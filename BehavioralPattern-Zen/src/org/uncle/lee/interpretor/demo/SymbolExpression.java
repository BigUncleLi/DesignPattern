package org.uncle.lee.interpretor.demo;

public abstract class SymbolExpression implements Expression {
	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
}
