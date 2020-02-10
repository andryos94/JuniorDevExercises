package com.courses;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayWithLambda {

	public static void main(String[] args) {
		IFunctional functionalObject = (x, y) -> (2 * x) + y;

		System.out.println(functionalObject.processValue(5, "5"));

		List<String> numbers = Arrays.asList("1", "2", "3", "4");
		System.out.println("string list " + numbers);
		System.out.println(
				"number list " + numbers.stream().map(value -> Integer.valueOf(value)).collect(Collectors.toList()));
		//List<Integer> even = numbers.stream().map(s -> Integer.valueOf(s)).filter(number -> number % 2 == 0).collect(Collectors.toList());
		List<Integer> even = numbers.stream().map(s -> Integer.valueOf(s)).collect(Collectors.toList());
		System.out.println("even numbers " + even);
	}

}
