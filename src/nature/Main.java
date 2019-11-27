package nature;

public class Main {

	public static void main(String[] args) {
		Terrestrial aTerrestrialAnimal = new Terrestrial(false, 5, 10, "monkeys", 4, 2);
		
		aTerrestrialAnimal.eat(5);
		aTerrestrialAnimal.fight();
		aTerrestrialAnimal.description();
		aTerrestrialAnimal.move(6);
		Animal a = aTerrestrialAnimal;
		a.description();
	}

}
