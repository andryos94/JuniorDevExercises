package nature;

public class Rhino extends Terrestrial{
	
	public Rhino(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
		super(carnivore, weight, size, species, legs, eyes);
	}
	
	@Override
	public void camouflage() {
		System.out.println("I'm using my thick skin, strong horn and impressive large size to defend.");
	}
}
