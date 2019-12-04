package nature;

public class Tiger extends Terrestrial{
	public Tiger(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
		super(carnivore, weight, size, species, legs, eyes);
	}
	
	@Override
	public void camouflage() {
		System.out.println("I'm a fearless beast! I don't hide!");
	}
}
