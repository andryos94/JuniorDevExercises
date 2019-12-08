package com.polimorfism;

public class Terrestrial extends Animal{
	private String food;
	
	public Terrestrial(String name, String color, String food) {
		super(name, color);
		this.food = food;
	}
	
	
	public void eat(String food) {
		System.out.println("The terrestrial animal eat: " + food);
	}
	
	@Override
	public void eat() {
		System.out.println("Override: The terrestrial animal eat: " + this.food);
	}

}
