package com.auto;

public class OnAir extends Vehicle {
	private int noTurbines;
	private boolean hasFirstClass;
	
	public int getNoTurbines() {
		return noTurbines;
	}

	public boolean isHasFirstClass() {
		return hasFirstClass;
	}

	public OnAir(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
		this.noTurbines = 2;
	}
	
	public OnAir(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
		this.noTurbines = 2;
	}
	
	public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
		super(serialNumber, noPersons, name);
		this.noTurbines = noTurbines;
	}
	
	public OnAir(String serialNumber, int noPersons, String name, int noTurbines, boolean hasFirstClass) {
		this(serialNumber,noPersons,name,noTurbines);
		this.hasFirstClass = hasFirstClass;
	}
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Flying the airplane to coordinates: [" + positionX + ", " + positionY + "]");
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the airplane");
		return true;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Airplane properties:\n\t - number of turbines: " + getNoTurbines());
		if(isHasFirstClass() == true) {
			System.out.println("\t - has first class");
		} else {
			System.out.println("\t - does not have first class");
		}
	}
}
