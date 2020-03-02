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
	
	public static void main(String[] args) {
		
		/*List<String> str = new LinkedList<String>(Arrays.asList("tenis", "fotbal", null, "volei"));
		System.out.println(countChars(str));*/
		System.out.println(updateString("0"));
	}

}
