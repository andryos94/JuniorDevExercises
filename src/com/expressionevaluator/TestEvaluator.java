package com.expressionevaluator;

public class TestEvaluator {

	public static void main(String[] args) {
		ExpressionEvaluator e = new ExpressionEvaluator();
		System.out.println(e.convertIntoPostFixedForm("3+(2+1)*2^3^2-8/(5-1*2/2)"));
		//System.out.println(e.evaluateExpression("321+232^^*+8512*2/-/-"));
	}

}
