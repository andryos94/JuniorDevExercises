package nature;

public class Zebra extends Terrestrial {

	public Zebra(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
		super(carnivore, weight, size, species, legs, eyes);
	}
	
	@Override
	public void camouflage() {
		System.out.println("Quick! Grouping all together confuses the predator!");
	}
}
