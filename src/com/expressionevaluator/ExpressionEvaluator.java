package com.expressionevaluator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ExpressionEvaluator {
	private Deque<Character> postFixedFormQueue;
	private Deque<Character> operatorsStack;
	private Deque<String> stackOperands;

	public ExpressionEvaluator() {
		postFixedFormQueue = new ArrayDeque<Character>();
		operatorsStack = new LinkedList<Character>();
		stackOperands = new LinkedList<String>();
	}

	public int precedenta(char c) {
		switch (c) {
		case '+':
		case '-':
			return 11;
		case '*':
		case '/':
			return 12;
		default:
			return 13;
		}
	}

	public boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
			return true;
		}
		return false;
	}

	public String convertIntoPostFixedForm(String normalForm) {
		for (int i = 0; i < normalForm.length(); i++) {
			char ch = normalForm.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				postFixedFormQueue.add(ch);
			}

			if (isOperator(ch)) {
				if (!operatorsStack.isEmpty()) {
					while (!operatorsStack.isEmpty() &&  operatorsStack.peek() != '(' && ((precedenta(ch) < precedenta(operatorsStack.peek()))
							|| (precedenta(ch) == precedenta(operatorsStack.peek()) && operatorsStack.peek() != '^'))) {
						char c = operatorsStack.pop();
						postFixedFormQueue.add(c);

					}
				}
				operatorsStack.push(ch);
			}

			if (ch == '(') {
				operatorsStack.push(ch);
			}

			if (ch == ')') {
				while (!operatorsStack.isEmpty() && operatorsStack.peek() != '(') {
					char o = operatorsStack.pop();
					postFixedFormQueue.add(o);
				}

				if (operatorsStack.isEmpty()) {
					return "For: The expression has wrong paranthesis!";
				}
				operatorsStack.pop();
			}
		}

		while (!operatorsStack.isEmpty()) {
			char o = operatorsStack.pop();
			if (o == '(') {
				return "The expression has wrong paranthesis!";
			}
			postFixedFormQueue.add(o);
		}

		return postFixedFormQueue.toString();
	}

	public int evaluateExpression(String postfixedForm) {
		for (int i = 0; i < postfixedForm.length(); i++) {
			char c = postfixedForm.charAt(i);
			String c_str = Character.toString(c);
			if (Character.isLetterOrDigit(c)) {
				stackOperands.push(c_str);
			}

			if (isOperator(c)) {
				if (stackOperands.isEmpty()) {
					System.out.println("The postfixed form is wrong!");
					return 0;
				}
				int op1 = Integer.parseInt((stackOperands.pop()));
				int op2 = Integer.parseInt((stackOperands.pop()));

				int res = 0;
				switch (c) {
				case '+':
					res = op2 + op1;
					break;
				case '-':
					res = op2 - op1;
					break;
				case '*':
					res = op2 * op1;
					break;
				case '/':
					res = op2 / op1;
					break;
				default:
					res = (int) Math.pow(op2, op1);
				}

				stackOperands.push(String.valueOf(res));
			}
		}

		int finalRes = Integer.parseInt(stackOperands.pop());
		if (!stackOperands.isEmpty()) {
			System.out.println("The postfixed form is wrong!");
			return 0;
		}

		return finalRes;
	}
}