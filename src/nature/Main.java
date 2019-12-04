package nature;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Terrestrial aTerrestrialAnimal = new Terrestrial(false, 5, 10, "monkeys", 4, 2);
		
		aTerrestrialAnimal.eat(5);
		aTerrestrialAnimal.fight();
		aTerrestrialAnimal.description();
		aTerrestrialAnimal.move(6);
		Animal a = aTerrestrialAnimal;
		a.description();
		Zebra zebra = new Zebra(false, 25, 40, "Mountain Zebra", 4, 2);
		Tiger tiger = new Tiger(true, 40, 70, "Siberian tiger", 4, 2);
		Tiger tiger2 = new Tiger(true, 40, 70, "Bengal tiger", 4, 2);
		Rhino rhino = new Rhino(false, 80, 70, "White rhino", 4, 2);
		
		ArrayList<Terrestrial> arrayTer = new ArrayList<Terrestrial>();
		arrayTer.add(zebra);
		arrayTer.add(tiger);
		arrayTer.add(tiger2);
		arrayTer.add(rhino);
		
		for(int i = 0; i < arrayTer.size(); i++) {
			arrayTer.get(i).camouflage();
		}
	}

}
