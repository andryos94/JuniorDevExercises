package com.geometrics.abstracti;

import com.geometrics.abstracti.Rectangle;
import com.geometrics.abstracti.Triangle;

public class Main {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(50, 11, "Yellow rectangle", "steel");
		Shape s2 = new Rectangle(12, 50, "Blue rectangle", "steel");
		Shape s3 = new Triangle(20, 30, "I reflect light", "glass");
		Shape s4 = new Triangle(20, 30, "I don't reflect light", "wood");
		System.out.println("Shape s3 is equal to s4?: " + s3.equals(s4));
		
		Shape s5 = new Triangle(20, 30, "I don't reflect light", "wood");
		System.out.println("Shape s4 is equal to s5?: " + s4.equals(s5));
		
		Shape s6 = new Rectangle(20, 30, "I don't reflect light", "wood");
		System.out.println("Shape s5 is equal to s6?: " + s5.equals(s6));
	}

}
