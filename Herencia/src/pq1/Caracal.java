package pq1;

public class Caracal extends Animal{

	private String habitat;

	public Caracal(String categoria, int patas, String habitat) {
		super(categoria, patas);
		this.habitat=habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public void comoSuena() {
		System.out.println("miaaaaaaau miaaaaaau");
	}

	@Override
	public String toString() {
		return "Caracal [habitat=" + habitat + super.toString();
	}
}
