package com.courses;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCourse {
	///first version
	public static void getMaxFrequency(String sentence) {
		ArrayList<Character> elements = decomposeString(sentence);
		int max = 0;
		ArrayList<Character> cachedChars = new ArrayList<Character>();
		int[] maxAparition = new int[elements.size()];
		int numberOfElem = 0;

		for (int i = 0; i < elements.size(); i++) {
			if (!cachedChars.contains(elements.get(i))) {
				cachedChars.add(elements.get(i));
				maxAparition[numberOfElem] = 1;
				numberOfElem++;
			} else {
				int index = cachedChars.indexOf(elements.get(i));
				int aparition = maxAparition[index];
				aparition++;
				maxAparition[index] = aparition;
				if (aparition > max) {
					max = aparition;
				}
			}
		}

		maxAparition = Arrays.copyOf(maxAparition, numberOfElem);
		for (int i = 0; i < maxAparition.length; i++) {
			if (max == maxAparition[i]) {
				System.out.println("Character '" + cachedChars.get(i) + "' appears " + max + " times.");
			}
		}
	}

	public static ArrayList<Character> decomposeString(String sentence) {
		ArrayList<Character> returnedChars = new ArrayList<Character>();
		for (int i = 0; i < sentence.length(); i++) {
			if (!Character.isWhitespace(sentence.charAt(i))) {
				returnedChars.add(sentence.charAt(i));
			}
		}
		return returnedChars;
	}
	
	///second version
	/*public class Data{
		private int numberOfAparition;
		private char charAssigned;
		
		public int getNumberOfAparition() {
			return numberOfAparition;
		}

		public void setNumberOfAparition(int numberOfAparition) {
			this.numberOfAparition = numberOfAparition;
		}

		public char getCharAssigned() {
			return charAssigned;
		}

		public void setCharAssigned(char charAssigned) {
			this.charAssigned = charAssigned;
		}

		public Data(int numberOfAparition, char charAssigned) {
			this.charAssigned = charAssigned;
			this.numberOfAparition = numberOfAparition;
		}
	}*/
	
	/*public void addValues(int[] numberOfAparition, char[] charAssigned) {
		ArrayList<Data> list = new ArrayList<>();
		if(charAssigned.length == numberOfAparition.length) {
			for(int i = 0; i < charAssigned.length; i++) {
				list.add(new Data(numberOfAparition[i], charAssigned[i]));
			}
			printValues(list);
		} else {
			System.out.println("No values added. The lengths of the both arrays must be equal!");
		}
	}
	
	public void printValues(ArrayList<Data> list) {
		for(int i = 0; i < list.size(); i++) {
			Data data = list.get(i);
			System.out.println(data.getCharAssigned() + " " + data.getNumberOfAparition());
		}
	}*/
	
	/*public void getMaxFrequency(String sentence) {
		ArrayList<Character> elements = decomposeString(sentence);
		int max = 0;
		ArrayList<Data> list = new ArrayList<Data>();
		Data data = new Data(0, '\0');
		for (int i = 0; i < elements.size(); i++) {
			if (data.getCharAssigned() != elements.get(i)) {
				data.setCharAssigned(elements.get(i));
				data.setNumberOfAparition(1);
				list.add(new Data(data.getNumberOfAparition(), data.getCharAssigned()));
			} else {
				int index = data.getNumberOfAparition();
				int aparition = list.get(index).getNumberOfAparition();
				aparition++;
				data.setNumberOfAparition(aparition);
				list.set(index, data);
				if (aparition > max) {
					max = aparition;
				}
			}
			data = list.get(i+1);
		}

		for (int i = 0; i < list.size(); i++) {
			data = list.get(i);
			if (max == data.getNumberOfAparition()) {
				System.out.println("Character '" + data.getCharAssigned() + "' appears " + max + " times.");
			}
		}
	}*/

	public static void main(String[] args) {
		ArrayList<String> inputArrayList = new ArrayList<String>(Arrays.asList("John", "Lucy", "Anna", "Kelly", "Dean", "Lucy", "Andrei"));
		inputArrayList.add(1, "Andrei");
		System.out.println(inputArrayList);
		boolean result = inputArrayList.add("Florin");
		if(result) {
			System.out.println(inputArrayList);
			System.out.println(inputArrayList.size());
		}
		System.out.println("Contains Kelly?: " + inputArrayList.contains("Kelly"));
		System.out.println(inputArrayList.containsAll(inputArrayList));
		System.out.println(inputArrayList.get(2));
		System.out.println(inputArrayList.indexOf("Andrei"));
		System.out.println(inputArrayList.lastIndexOf("Andrei"));
		inputArrayList.remove(1);
		System.out.println(inputArrayList);
		inputArrayList.set(0, "Andrei");
		System.out.println(inputArrayList);
		inputArrayList.clear();
		System.out.println(inputArrayList);
		
		////ex max Frequency
		///First version
		System.out.println("first sentence");
		/*ArrayListCourse obj = new ArrayListCourse();
		obj.getMaxFrequency("Simple sentence.");
		System.out.println("second sentence");
		obj.getMaxFrequency("Becoming a programmer is like gaining super powers!");*/
		getMaxFrequency("Simple sentence.");
		System.out.println("second sentence");
		getMaxFrequency("Becoming a programmer is like gaining super powers!");
	}

}
