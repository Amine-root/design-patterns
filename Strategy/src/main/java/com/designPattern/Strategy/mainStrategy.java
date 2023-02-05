package com.designPattern.Strategy;

public class mainStrategy {

	public static void main(String[] args) {
	
		ContextStrategy ctx1 = new ContextStrategy();
		ctx1.effectuerOperation();
		ctx1.setStrategy(new StrategyImpl1());
		ctx1.effectuerOperation();
		ctx1.setStrategy(new StrategyImpl2());
		ctx1.effectuerOperation();
		ctx1.setStrategy(new StrategyImpl3());
		ctx1.effectuerOperation();
	}

}
