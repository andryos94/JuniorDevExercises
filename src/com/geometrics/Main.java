package com.geometrics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Shape s1 = new Shape("Math is easy", "plastic");
		Shape s2 = new Shape();
		
		Rectangle r1 = new Rectangle(50, 11, "Yellow rectangle", "steel");
		Rectangle r2 = new Rectangle(12, 50, "Blue rectangle", "steel");
		
		Triangle t1 = new Triangle(20, 30, "I reflect light", "glass");
		Triangle t2 = new Triangle(20, 30, "I don't reflect light", "wood");
		
		
		///upcasting
		ArrayList<Shape> listShapes = new ArrayList<Shape>();
		listShapes.add(s1);
		listShapes.add(s2);
		listShapes.add(r1);
		listShapes.add(r2);
		listShapes.add(t1);
		listShapes.add(t2);
		
		for(int i = 0; i < listShapes.size(); i++) {
			System.out.println(listShapes.get(i).toString());
			System.out.println(listShapes.get(i).getSize());
		}
		
		///downcasting
		for(int i = 0; i < listShapes.size(); i++) {
			if(listShapes.get(i) instanceof Triangle) {
				Triangle t = (Triangle)listShapes.get(i);
				t.displayTriangleHeight();
			} else if(listShapes.get(i) instanceof Rectangle) {
				Rectangle r = (Rectangle)listShapes.get(i);
				r.displayRectangleHeight();
			} else {
				System.out.println("Error: unknown kind of shape");
			}
		}
		
		///toString()
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(r1);
		System.out.println(r2);
		
		///equals()
		Shape s3 = t1;
		Shape s4 = t2;
		System.out.println("Shape s3 is equal to s4?: " + s3.equals(s4));
		
		/*Rectangle r1 = new Rectangle(50, 11, "Yellow rectangle", "steel");
		Rectangle r2 = new Rectangle(12, 50, "Blue rectangle", "steel");
		
		Triangle t1 = new Triangle(20, 30, "I reflect light", "glass");
		Triangle t2 = new Triangle(20, 30, "I don't reflect light", "wood");*/
		
		Triangle t3 = new Triangle(20, 30, "I reflect light", "glass");
		System.out.println("The triangles t1 and t3 are equals?: " + t1.equals(t3));
		if(t1.equals(t3)) {
			System.out.println(t1.hashCode());
			System.out.println(t3.hashCode());
		}
		
		System.out.println("The shapes s1 and s2 are equals?: " + s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		r2 = new Rectangle(20, 30, "I don't reflect light", "wood");
		System.out.println("Rectangle r2 is equal to Triangle t2?: " + r2.equals(t2));///different types/classes
		Rectangle r3 = new Rectangle(20, 30, "I don't reflect light", "wood");
		System.out.println(r2 == r3);
	}

}
