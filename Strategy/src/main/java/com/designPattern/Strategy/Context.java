package com.designPattern.Strategy;

public class Context {

	public void effectuerOperation(int type) {
		if(type == 1)
		{
			System.out.println("*******************************");
			System.out.println("--------------Strategy 1-------");
			System.out.println("===============================");
		}
		else if(type == 2)
		{
			System.out.println("*******************************");
			System.out.println("--------------Strategy 2-------");
			System.out.println("===============================");
		}
		else if(type == 3)
		{
			System.out.println("*******************************");
			System.out.println("--------------Strategy 3-------");
			System.out.println("===============================");
		}
		//New version of the algorithm : request for an 4th Strategy
		else if(type == 4)
		{
			System.out.println("*******************************");
			System.out.println("--------------Strategy 4-------");
			System.out.println("===============================");
		}
		else
		{
			System.out.println("*******************************");
			System.out.println("--------------Strategy par default--");
			System.out.println("===============================");
		}
	}
	
	
	
}
