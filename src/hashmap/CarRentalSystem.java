package hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CarRentalSystem {
	private static Scanner sc = new Scanner(System.in);
	private int size;
	private HashMap<String, String> rentedCars = new HashMap<String, String>(100, 0.5f);
	private HashMap<String, RentedCar> ownerCars = new HashMap<String, RentedCar>();

	private static String getPlateNo() {
		System.out.println("Introduceti numarul de inmatriculare:");
		return sc.nextLine();
	}

	private static String getOwnerName() {
		System.out.println("Introduceti numele proprietarului:");
		return sc.nextLine();
	}

	private int getCarsNo(String ownerName) {
		if (!this.rentedCars.containsValue(ownerName)) {
			System.out.println("There is no owner with the name " + ownerName);
			return 0;
		}
		RentedCar c = this.ownerCars.get(ownerName);
		
		return c.getNoOfCars();
	}
	
	private Set<String> getCarsList(String ownerName){
		if (!this.rentedCars.containsValue(ownerName)) {
			System.out.println("There is no owner with the name " + ownerName);
			return null;
		}
		RentedCar c = this.ownerCars.get(ownerName);
		return c.getCarsRented();
	}

	// search for a key in hashtable
	private boolean isCarRent(String plateNo) {
		return this.rentedCars.containsKey(plateNo);
	}

	// get the value associated to a key
	private String getCarRent(String plateNo) {
		if (!this.rentedCars.containsKey(plateNo)) {
			return "The car is not registered in the db!";
		}
		return this.rentedCars.get(plateNo);
	}

	// add a new (key, value) pair
	private void rentCar(String plateNo, String ownerName) {
		this.rentedCars.put(plateNo, ownerName);
		this.size += 1;
		if(this.ownerCars.containsKey(ownerName)) {
			RentedCar c = this.ownerCars.get(ownerName);
			c.addCar(plateNo);
		} else {
			RentedCar c = new RentedCar();
			c.addCar(plateNo);
			this.ownerCars.put(ownerName, c);
		}
	}

	// remove an existing (key, value) pair
	private void returnCar(String plateNo) {
		if(!this.rentedCars.containsKey(plateNo)) {
			System.out.println("The car " + plateNo + " hasn't been found in the database!");
			return;
		}
		
		String ownerName = this.rentedCars.get(plateNo);
		this.rentedCars.remove(plateNo);
		this.size -= 1;
		RentedCar c = this.ownerCars.get(ownerName);
		c.removeCar(plateNo);
		
		System.out.println("The car " + plateNo + " was removed with success!");
	}

	private static void printCommandsList() {
		System.out.println("help         - Afiseaza aceasta lista de comenzi");
		System.out.println("add          - Adauga o noua pereche (masina, sofer)");
		System.out.println("check        - Verifica daca o masina este deja luata");
		System.out.println("remove       - Sterge o masina existenta din hashtable");
		System.out.println("getCarsList  - Afiseaza lista masinilor inchiriate de un singur proprietar");
		System.out.println("getCarsNo    - Afiseaza numarul de masini inchiriate de un singur proprietar");
		System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
		System.out.println("totalRented  - Afiseaza numarul total de masini inchiriate.");
		System.out.println("quit         - Inchide aplicatia");
	}

	public void run() {
		boolean quit = false;
		while (!quit) {
			System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
			String command = sc.nextLine();
			switch (command) {
			case "help":
				printCommandsList();
				break;
			case "add":
				String plateNo = getPlateNo();
				if (isCarRent(plateNo)) {
					System.out.println("The car " + plateNo + " is already in the database.");
					break;
				}
				String ownerName = getOwnerName();
				rentCar(plateNo, ownerName);
				break;
			case "check":
				System.out.println(isCarRent(getPlateNo()));
				break;
			case "remove":
				if (rentedCars.isEmpty()) {
					System.out.println("The database is empty!");
					break;
				}
				returnCar(getPlateNo());
				break;
			case "getCarsList":
				System.out.println(getCarsList(getOwnerName()));
				break;
			case "getCarsNo":
				System.out.println(getCarsNo(getOwnerName()));
				break;
			case "getOwner":
				if (rentedCars.isEmpty()) {
					System.out.println("The database is empty!");
					break;
				}
				System.out.println(getCarRent(getPlateNo()));
				break;
			case "totalRented":
				System.out.println("Total number of rented car is " + this.size);
				break;
			case "quit":
				System.out.println("Aplicatia se inchide...");
				quit = true;
				break;
			default:
				System.out.println("Unknown command. Choose from:");
				printCommandsList();
			}
		}
	}

	public static void main(String[] args) {

		// create and run an instance (for test purpose)
		new CarRentalSystem().run();

	}
}
