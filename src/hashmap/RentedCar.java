package hashmap;

import java.util.HashSet;
import java.util.Set;

public class RentedCar {
	private Set<String> carsRented = new HashSet<String>();
	private int noOfCars;

	public boolean addCar(String nameCar) {
		boolean tag = this.carsRented.add(nameCar);
		if (tag) {
			this.noOfCars += 1;
			return true;
		}
		return false;
	}

	public boolean removeCar(String nameCar) {
		boolean tag = this.carsRented.remove(nameCar);
		if (tag) {
			this.noOfCars -= 1;
			return true;
		}
		return false;
	}

	public Set<String> getCarsRented() {
		return carsRented;
	}

	public int getNoOfCars() {
		return noOfCars;
	}
}
