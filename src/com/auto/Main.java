package com.auto;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("3FDS9DFF8FSD7", 4, "Moby");
		v1.addFuel(23.4);
		v1.goTo(0, 15.5);
		v1.printInfo();
		
		OnWater v1_water = new OnWater("F8GFDG86D87GGD", 20, "Wavess", 2, 2000.0);
		v1_water.addFuel(23.4);
		v1_water.goTo(0, 15.5);
		v1_water.printInfo();
		
		OnRoad v1_road = new OnRoad("FDFL8KMFSDLKM6", 2, "Sporty", 4, 2);
		v1_road.addFuel(124);
		v1_road.goTo(23, 12);
		v1_road.printInfo();
		
		OnAir v1_air = new OnAir("GJR96GDF98DF9ND", 120, "Bluesky", 4, true);
		v1_air.addFuel(123.43);
		v1_air.goTo(23, 11);
		v1_air.printInfo();
		
		//Vehicle properties didn't change
		v1.printInfo();
		
		///another constructor
		OnWater v2_water = new OnWater("F8GFDG86D87GGD", 20);
		v2_water.printInfo();
		
		/*Desi in cadrul implementarii unei clase este perfect valid sa accesam metode sau campuri ale 
		 * clasei-parinte care au fost suprascrise (i.e. folosind super), nu putem accesa din exterior metode 
		 * sau campuri suprascrise. Intocmai cu terminologia, suprascrierea metodelor / campurilor face ca acestea sa 
		 * devina ascunse (eng: hidden) din exterior. In concluzie, atunci cand lucram cu obiecte putem accesa din clasa-parinte 
		 * numai metodele si campurile care nu au fost suprascrise.
		 */
		v1.addFuel(23);
		///upcasting
		Vehicle v3= new OnAir("GJR96GDF98DF9ND", 120, "Bluesky");
		v3.addFuel(23);
		v3.printInfo();
		
		ArrayList<Vehicle> listVehicles = new ArrayList<Vehicle>();
		listVehicles.add(v1);
		listVehicles.add(v1_air);
		listVehicles.add(v1_road);
		listVehicles.add(v1_water);
		listVehicles.add(v3);
		
		System.out.println("Print elements from the array:");
		
		for(int i = 0; i < listVehicles.size(); i++) {
			listVehicles.get(i).printInfo();
		}

	}

}
