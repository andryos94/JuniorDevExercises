package com.matrix;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printArrayList(ArrayList<Integer> array) {
		for(int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				System.out.print(matrix.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);

		System.out.println("Input for generating the matrix using array structure:");
		String inputStr = sc.nextLine();

		String[] inputArrayStr = inputStr.split(" ");
		int[] inputArrayInt = new int[inputArrayStr.length];
		for (int i = 0; i < inputArrayInt.length; i++) {
			inputArrayInt[i] = Integer.parseInt(inputArrayStr[i]);
		}
		
		printMatrix(Operation.generateMatrixUsingArray(inputArrayInt[0], inputArrayInt[1], inputArrayInt[2], inputArrayInt[3], inputArrayInt[4], inputArrayInt[5], inputArrayInt[6], inputArrayInt[7]));
		System.out.println("Input for generating the matrix using ArrayList structure:");
		printMatrix(Operation.generateMatrixUsingArrayList(inputArrayInt[0], inputArrayInt[1], inputArrayInt[2], inputArrayInt[3], inputArrayInt[4], inputArrayInt[5], inputArrayInt[6], inputArrayInt[7]));
		*/
		int[][] matrix1 = {{2,10}, {8,1}, {5,5}};
		
		int[][] matrix2 = {{4,7}, {0,3}, {5,10}};
		
		System.out.println("Sum of 2 matrix");
		printMatrix(Operation.sumTwoMatrix(matrix1, matrix2));
		System.out.println("Dif of 2 matrix");
		printMatrix(Operation.difTwoMatrix(matrix1, matrix2));
		System.out.println("Multiply a matrix by a constant");
		printMatrix(Operation.multiplyMatrixWithConstant(matrix2, 2));
		
		int[][] matrix3 = {{2,3}, {6,1}, {5,1}};
		int[][] matrix4 = {{4,3,0}, {5,5,1}};
		System.out.println("Multiply 2 matrix");
		printMatrix(Operation.multiplyTwoMatrix(matrix3, matrix4));
		
		printArrayList(Operation.eristatonePrimeNumbers(Operation.generateArray(60)));
	}

}
