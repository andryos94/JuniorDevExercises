package com.geometrics.abstracti;

import com.geometrics.abstracti.Shape;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle(int base, int height, String text, String material) {
		super(text, material);
		this.base = base;
		this.height = height;
	}
	
	public void displayTriangleHeight() {
		System.out.println("Triangle height is: " + this.height);
	}
	
	@Override
	public double getSize() {
		return (this.base * this.height)/2;
	}
	
	@Override
	public String toString() {
		return "Triangle: height is " + this.height + ", base is: " + this.base + ", " + super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Triangle other = (Triangle) obj;
		if(super.equals(other) && (this.base == other.base) && (this.height == other.height)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result = super.hashCode();
		result = prime * result + this.base;
		result = prime * result + this.height;
		return result;
	}
}
