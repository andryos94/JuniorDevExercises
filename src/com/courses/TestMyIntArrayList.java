package com.courses;

public class TestMyIntArrayList {
	public static void printMyIntArrayList(MyIntArrayList c) {
		for(int i = 0; i < c.size(); i++) {
			System.out.print(c.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MyIntArrayList testArrayList = new MyIntArrayList(10);
		
		int[] array = new int[] {2,4,5,2,0,90,11};
		for(int i = 0; i < array.length; i++) {
			testArrayList.add(array[i]);
		}
		printMyIntArrayList(testArrayList);
		
		testArrayList.add(3, 100);
		printMyIntArrayList(testArrayList);
		
		if(testArrayList.contains(5)) {
			testArrayList.remove(5);
		}
		printMyIntArrayList(testArrayList);
		
		if(!testArrayList.contains(23)) {
			testArrayList.add(23);
		}
		printMyIntArrayList(testArrayList);
		
		MyIntArrayList test2ArrayList = new MyIntArrayList();
		for(int i = 0; i < array.length/2; i++) {
			test2ArrayList.add(array[i]);
		}
		printMyIntArrayList(test2ArrayList);
		
		testArrayList.addAll(test2ArrayList);
		printMyIntArrayList(testArrayList);
		
		testArrayList.addAll(3, test2ArrayList);
		printMyIntArrayList(testArrayList);
		
		testArrayList.set(0, 121);
		printMyIntArrayList(testArrayList);
		System.out.println(testArrayList.size());
		
		testArrayList.clear();
		printMyIntArrayList(testArrayList);
		System.out.println(testArrayList.size());
		
		testArrayList.addAll(test2ArrayList);
		printMyIntArrayList(testArrayList);
	}

}
