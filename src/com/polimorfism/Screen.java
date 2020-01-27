package com.polimorfism;

import java.util.ArrayList;

public class Screen {
	private ArrayList<Pixel> pixels;
	private Dimensions dimensions;
	
	public ArrayList<Pixel> getPixels(){
		return this.pixels;
	}
	
	public Dimensions getDimensions() {
		return this.dimensions;
	}
	
	public Screen(int noOfPixels, Dimensions dimensions) {
		//this.pixels = new ArrayList<Pixel>(noOfPixels);
		this.pixels = new ArrayList<Pixel>(noOfPixels);
		for(int i = 0; i < noOfPixels; i++) {
			this.pixels.add(new Pixel());
		}
		this.dimensions = dimensions;
	}
	
	public void setPixel(int indexOfPixel, String color) {
		this.pixels.get(indexOfPixel).setColor(color);
	}
	
	public void colorScreen(String color) {
		for(int i = 0; i < this.pixels.size(); i++) {
			this.setPixel(i, color);
		}
	}
	
	public void displayPixels() {
		for(int i = 0; i < this.pixels.size(); i++) {
			System.out.print(this.pixels.get(i) + " ");
		}
		System.out.println();
	}
	
}
