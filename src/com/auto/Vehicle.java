package com.auto;

public class Vehicle {
	private final String serialNumber;
	private int noPersons;
	private String name;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public Vehicle(String serialNumber, int noPersons) {
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}
	
	public Vehicle(String serialNumber, int noPersons, String name) {
		this(serialNumber,noPersons);
		this.name = name;
	}
	
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move…");
		return false;
	}
	
	public boolean addFuel(double amount) {
		
	}
}
