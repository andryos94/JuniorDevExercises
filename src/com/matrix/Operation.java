package com.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Operation {

	public static int[][] generateMatrixUsingArray(int matrixDimension, int mainDiagValue, int sndDiagValue,
			int centerValue, int leftValue, int upValue, int rightValue, int bottomValue) {

		int[][] matrix = new int[matrixDimension][matrixDimension];
		for (int i = 0; i < matrixDimension; i++) {
			for (int j = 0; j < matrixDimension; j++) {
				if (i == j) {
					matrix[i][j] = mainDiagValue;
				}

				if (i + j == matrixDimension - 1) {
					matrix[i][j] = sndDiagValue;
				}

				if ((i > j) && (i + j < matrixDimension - 1)) {
					matrix[i][j] = leftValue;
				}

				if ((i < j) && (i + j < matrixDimension - 1)) {
					matrix[i][j] = upValue;
				}

				if ((i < j) && (i + j > matrixDimension - 1)) {
					matrix[i][j] = rightValue;
				}

				if ((i > j) && (i + j > matrixDimension - 1)) {
					matrix[i][j] = bottomValue;
				}
			}
		}

		if (matrixDimension % 2 != 0) {
			matrix[matrixDimension / 2][matrixDimension / 2] = centerValue;
		}

		return matrix;
	}

	public static ArrayList<ArrayList<Integer>> generateMatrixUsingArrayList(int matrixDimension, int mainDiagValue, int sndDiagValue,
			int centerValue, int leftValue, int upValue, int rightValue, int bottomValue) {

		ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>(matrixDimension);
		for (int i = 0; i < matrixDimension; i++) {
			ArrayList<Integer> newRow = new ArrayList<Integer>(matrixDimension); // new row
			for (int j = 0; j < matrixDimension; j++) {
				newRow.add(0);
			}
			numbers.add(newRow);
		}
		for (int i = 0; i < matrixDimension; i++) {
			for (int j = 0; j < matrixDimension; j++) {
				if (i == j) {
					numbers.get(i).set(j, mainDiagValue);
				}

				if (i + j == matrixDimension - 1) {
					numbers.get(i).set(j, sndDiagValue);
				}

				if ((i > j) && (i + j < matrixDimension - 1)) {
					numbers.get(i).set(j, leftValue);
				}

				if ((i < j) && (i + j < matrixDimension - 1)) {
					numbers.get(i).set(j, upValue);
				}

				if ((i < j) && (i + j > matrixDimension - 1)) {
					numbers.get(i).set(j, rightValue);
				}

				if ((i > j) && (i + j > matrixDimension - 1)) {
					numbers.get(i).set(j, bottomValue);
				}
			}
		}

		if (matrixDimension % 2 != 0) {
			numbers.get(matrixDimension / 2).set(matrixDimension / 2, centerValue);
		}

		return numbers;
	}
	
	public static int[][] generateMatrixElemByElem(int rows, int cols, Scanner sc){
		System.out.println("Type the elements in the order [0][0], [0][1], ..[1][0], [1][1]..:");
		int[][] matrix = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}
	
	public static int[][] sumTwoMatrix(int[][] matrix1, int[][] matrix2){
		if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			return null;
		}
		int[][] matrixSum = new int[matrix1.length][matrix1[0].length];
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix1[i].length; j++) {
				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return matrixSum;
	}
	
	public static int[][] difTwoMatrix(int[][] matrix1, int[][] matrix2){
		if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			return null;
		}
		int[][] matrixDif = new int[matrix1.length][matrix1[0].length];
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix1[i].length; j++) {
				matrixDif[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		return matrixDif;
	}
	
	public static int[][] multiplyMatrixWithConstant(int[][] matrix, int k){
		int[][] matrixMul = new int[matrix.length][matrix[0].length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrixMul[i][j] = matrix[i][j] * k;
			}
		}
		return matrixMul;
	}
	
	public static int[][] multiplyTwoMatrix(int[][] matrix1, int[][] matrix2){
		if(matrix1[0].length != matrix2.length) {
			return null;
		}
		
		int[][] matrixMul = new int[matrix1.length][matrix2[0].length];
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix2[0].length; j++) {
				for(int k = 0; k < matrix1[0].length; k++) {
					matrixMul[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return matrixMul;
	}
	
	public static ArrayList<Integer> eristatonePrimeNumbers(int[] array) {
		ArrayList<Integer> returnedArray = new ArrayList<Integer>();
		returnedArray.add(2);
		returnedArray.add(3);
		returnedArray.add(5);
		returnedArray.add(7);
		if(array.length < 10) {
			return returnedArray;
		}
		for(int i = 9; i < array.length; i++) {
			if(array[i] % 2 == 0 || array[i] % 3 == 0 || array[i] % 5 == 0 || array[i] % 7 == 0) {
				continue;
			} else {
				returnedArray.add(array[i]);
			}
		}
		return returnedArray;
	}
	
	public static int[] generateArray(int n) {
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		return array;
	}
}
