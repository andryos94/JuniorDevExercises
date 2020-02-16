package stackandqueue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MainHW {
	public static boolean isValidParantheses(String s) {
		Deque<String> parantheses = new LinkedList<String>(Arrays.asList(s.split("")));
		Deque<String> temp = new LinkedList<String>();

		while (!parantheses.isEmpty()) {
			if (temp.isEmpty()) {
				temp.push(parantheses.pop());
				if (parantheses.isEmpty()) {
					return false;
				}
			}

			if (Math.abs(parantheses.peek().charAt(0) - temp.peek().charAt(0)) >= 1
					&& Math.abs(parantheses.peek().charAt(0) - temp.peek().charAt(0)) <= 2) {
				parantheses.pop();
				temp.pop();
			} else {
				temp.push(parantheses.pop());
			}
		}

		if (parantheses.isEmpty() && temp.isEmpty()) {
			return true;
		}

		return false;
	}

	/// baseball game
	public static int calPoints(String[] ops) {
		Deque<Integer> operands = new LinkedList<Integer>();
		Deque<Integer> sums = new LinkedList<Integer>();

		int sum = 0;
		int res = 0;
		for (int i = 0; i < ops.length; i++) {
			switch (ops[i]) {
			case "D":
				res = (int) operands.peek();
				operands.push(Integer.valueOf(2*res));
				sum = 2 * res + (int) (sums.peek());
				sums.push(Integer.valueOf(sum));
				break;
			case "C":
				res = (int) operands.pop();
				sum = (int) (sums.peek()) - res;
				sums.push(Integer.valueOf(sum));
				break;
			case "+":
				Integer temp = operands.pop();
				res = (int) temp + operands.peek();
				operands.push(temp);
				operands.push(Integer.valueOf(res));
				sum = (int) (sums.peek()) + res;
				sums.push(Integer.valueOf(sum));
				break;
			default:
				res = Integer.parseInt(ops[i]);
				if (sums.isEmpty()) {
					sums.push(Integer.valueOf(res));
				} else {
					sum = (int) (sums.peek()) + res;
					sums.push(Integer.valueOf(sum));
				}
				operands.push(res);
			}
		}
		
		return (int) sums.peek();
	}

	public static void main(String[] args) {
		/*
		 * System.out.println(isValidParantheses("(((([{}]))))[]"));
		 * System.out.println(isValidParantheses("()(([])){[[()]]}"));
		 * System.out.println(isValidParantheses("()[([{}])]"));
		 * System.out.println(isValidParantheses("[[]])"));
		 * System.out.println(isValidParantheses("[(])"));
		 */

		/*Deque<Integer> list = new LinkedList<Integer>();
		MinStack<Integer> minList = new MinStack<Integer>(list);// dau ca parametru o stiva
		minList.push(Integer.valueOf(22));
		minList.push(Integer.valueOf(10));
		minList.push(Integer.valueOf(15));
		System.out.println(minList);
		System.out.println(minList.getMinimum());
		System.out.println();
		minList.push(Integer.valueOf(4));
		System.out.println(minList);
		System.out.println(minList.getMinimum());
		System.out.println();
		minList.push(Integer.valueOf(8));
		System.out.println(minList);
		System.out.println(minList.getMinimum());
		System.out.println();
		minList.pop();
		minList.pop();
		System.out.println(minList);
		System.out.println(minList.getMinimum());*/
		
		String[] testBaseball = {"5","-2","4","C","D","9","+","+"}; 
		System.out.println(calPoints(testBaseball));
		String[] test1Baseball = {"5","2","C","D","+"};
		System.out.println(calPoints(test1Baseball));
	}

}
