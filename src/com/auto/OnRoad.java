package com.auto;

public class OnRoad extends Vehicle {
	private int noWheels;
	private int noDoors;
	
	public int getNoWheels() {
		return noWheels;
	}

	public int getNoDoors() {
		return noDoors;
	}

	public OnRoad(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
		this.noDoors = 4;
		this.noWheels = 4;
	}
	
	public OnRoad(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
		this.noDoors = 4;
		this.noWheels = 4;
	}
	
	public OnRoad(String serialNumber, int noPersons, String name, int noWheels) {
		super(serialNumber, noPersons, name);
		this.noWheels = noWheels;
		this.noDoors = 4;
	}
	
	public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors) {
		this(serialNumber,noPersons,name,noWheels);
		this.noDoors = noDoors;
	}
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Driving the vehicle on road to coordinates: [" + positionX + ", " + positionY + "]");
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the driving vehicle");
		return true;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Driving vehicle properties:\n\t - number of wheels: " + getNoWheels() + "\n\t - number of doors: " + getNoDoors());
	}
}
