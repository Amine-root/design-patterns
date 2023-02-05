package com.designPattern.Strategy;

public class ContextStrategy {
	
	private Strategy strategy = new StrategyDefaultImpl();
	
	public void effectuerOperation() {
		System.out.println("**************************");
		strategy.operation();
		System.out.println("**************************");
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
	
}
