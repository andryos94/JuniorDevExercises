package com.polimorfism;

public class Pixel {
	private String color;
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Pixel() {
		this.color = "white";
	}
	
	public Pixel(String color) {
		this.color = color;
	}
	
	public String toString() {
		return this.color;
	}
}
