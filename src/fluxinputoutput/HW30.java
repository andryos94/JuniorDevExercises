package fluxinputoutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HW30 {

	public static void main(String[] args) throws IOException {
		//ex 1
		/*List<String> listLines = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		String firstWord = sc.next();
		String secondWord = sc.next();
		sc.close();
		
		/*try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("TextInput.txt")))) {
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				String nextLineMod = nextLine.replaceAll(firstWord, secondWord);
				listLines.add(nextLineMod);
			}
		}
		
		try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextOutput.txt"))) {
			for (String line : listLines) {
				outputFile.write(line + "\n");
			}
		}
		
		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("TextInput.txt")));
				BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextOutput.txt"))) {
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				String nextLineMod = nextLine.replaceAll(firstWord, secondWord);
				outputFile.write(nextLineMod + "\n");
			}
		}*/
		
		//ex2
		/*try (Scanner scanner1 = new Scanner(new BufferedReader(new FileReader("Numbers1.txt")));
				Scanner scanner2 = new Scanner(new BufferedReader(new FileReader("Numbers2.txt")));
				BufferedWriter outputFile = new BufferedWriter(new FileWriter("NumbersMerge.txt"))) {
			String firstNumbers = scanner1.nextLine();
			String secondNumbers = scanner2.nextLine();
			String[] concat = (firstNumbers + " " + secondNumbers).split(" ");
			int[] concatInt = new int[concat.length];
			for(int i = 0; i < concat.length; i++) {
				concatInt[i] = Integer.valueOf(concat[i]);
			}
			Arrays.sort(concatInt);
			for(int i = 0; i < concatInt.length; i++) {
				outputFile.write(concatInt[i] + " ");
			}
		}*/
		
		///ex3
		try (Scanner scanner = new Scanner(System.in);
				BufferedWriter outputFile = new BufferedWriter(new FileWriter("results.txt"))){
			String[] readLine = scanner.nextLine().split(" ");
			String minWord = "";
			String maxWord = "";
			int min = Integer.MAX_VALUE;
			for(String s:readLine) {
				if(s.length() < min) {
					minWord = s;
					min = s.length();
				} else {
					maxWord = s;
				}
			}
			Arrays.sort(readLine);
			System.out.println(minWord + " " + maxWord + " " + readLine[0]);
			outputFile.write("The short word is: " + minWord + "\n");
			outputFile.write("The longest word is: " + maxWord + "\n");
			outputFile.write("The first ordered word is: " + readLine[0] + "\n");
			outputFile.write("The last ordered word is: " + readLine[readLine.length - 1] + "\n");
			outputFile.write("The total number of words is: " + readLine.length);
		}

	}

}
