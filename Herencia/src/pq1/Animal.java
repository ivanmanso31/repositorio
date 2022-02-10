package pq1;

import ejercicios2.Instrumento;

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
		System.out.println("Todavía no lo se");
	}
	@Override
	public String toString() {
		return "Animal [categoria=" + categoria + ", patas=" + patas + "]";
	}
	public boolean equals(Object obj) {
		Animal a=(Animal)obj;
		if(a.categoria.equals(categoria) && a.patas==patas) {
			return true;
		}
		return false;
	}
	
}
