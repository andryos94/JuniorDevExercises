package com.exception;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static int countChars(List<String> list) {
		int amount = 0;
		for(String word:list) {
			try {
				amount += word.length();
			} catch (IndexOutOfBoundsException e) {//exception catching incorrectly
				// TODO: handle exception
			}
		}
		return amount;
	}
	
	public static String updateString(String s) {
		try {
			s += "2";
			throw new NullPointerException();
		} catch (NullPointerException e){
			s += "1";
			return s;
		} finally {
			s += "5";
			return s;
		}
	}
	
	private static int division(int dividend, int divisor) throws ArithmeticException {
		if(divisor == 0) {
			throw new ArithmeticException("'divisor' should not be 0!");
		}
		return dividend/divisor;
	}
	
	public static void main(String[] args) {
		
		/*List<String> str = new LinkedList<String>(Arrays.asList("tenis", "fotbal", null, "volei"));
		System.out.println(countChars(str));*/
		System.out.println(updateString("0"));
		try {
			System.out.println(division(10, 0));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("'divisor' should not be 0!");
		}
	}

}
