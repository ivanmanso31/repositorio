package pq1;

public class Gato extends Animal {

	public Gato(String categoria, int patas) {
		super(categoria, patas);
	}
	
	@Override
	public void comoSuena() {
		System.out.println("miau miau");
	}

	@Override
	public String toString() {
		return "Gato "+super.toString();
	}
}
