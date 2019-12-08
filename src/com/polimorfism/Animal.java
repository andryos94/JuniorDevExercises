package com.polimorfism;

public class Animal {
	private String name;
	private String color;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public void eat() {
		System.out.println("Animals can eat.");
	}

}
