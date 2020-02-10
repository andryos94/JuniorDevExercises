package linkedlist;

import java.util.LinkedList;

import java.util.List;
import java.util.ListIterator;

public class LinkedListApp {

	public static void main(String[] args) {
		List<String> towns = new LinkedList<>();
		
		towns.add("Bucuresti");
		towns.add("Braila");
		towns.add("Buzau");
		towns.add("Iasi");
		System.out.println(towns.remove(2));
		System.out.println();
		//ListIterator<String> listIt = towns.listIterator(); => exceptie
		towns.add("Buzau");
		
		ListIterator<String> listIt = towns.listIterator();
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		
		///Test of class Town. contains() nu are implementate hashcode() si equals()
		
		List<Town> newTowns = new LinkedList<Town>();
		newTowns.add(new Town("Brasov", 20));
		System.out.println(newTowns.contains(new Town("Brasov", 20)));//=> fara equals, false
	}

}
