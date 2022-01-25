package pq1;

public class Animal {

	private String categoria;
	private int patas;
	
	public Animal(String categoria, int patas) {
		this.categoria=categoria;
		this.patas=patas;
	}
	
	public Animal(String categoria) {
		this.categoria=categoria;
		this.patas=0;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public void comoSuena() {
		System.out.println("Todav�a no lo se");
	}
	@Override
	public String toString() {
		return "Animal [categoria=" + categoria + ", patas=" + patas + "]";
	}
	
}
