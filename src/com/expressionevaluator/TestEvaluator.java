package com.expressionevaluator;

public class TestEvaluator {

	public static void main(String[] args) {
		ExpressionEvaluator e = new ExpressionEvaluator();
		String postFixedForm = e.convertIntoPostFixedForm("3+(2+1)*2^3^2-8/(5-1*2/2)");
		System.out.println(postFixedForm);
		System.out.println(e.evaluateExpression(postFixedForm));
	}

}
