package com.polimorfism;

public class AppAnimal {

	public static void main(String[] args) {
		Animal a = new Animal("Kitty", "blue");
		a.eat();
		///dynamic binding
		Animal a1 = new Terrestrial("Colt", "black", "cheese");
		a1.eat();
		
		Terrestrial t = new Terrestrial("Colt", "black", "cheese");
		t.eat();
		t.eat("old cheese");

	}

}
