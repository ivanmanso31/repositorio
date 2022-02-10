package pq1;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Animal> catalogo;
	public Zoo() {
		catalogo=new ArrayList<Animal>();
	}
	
	public ArrayList<Animal> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(ArrayList<Animal> catalogo) {
		this.catalogo = catalogo;
	}

	public ArrayList<String> listadoIndCategoria() {
		ArrayList<String> salida=new ArrayList<String>();
		
		return	salida;
	}
	
	public int IndCategoria(String categoria) {
		int contador=0;
		for (Animal miA : catalogo) {
			if(miA.getCategoria().equals(categoria)) {
				contador++;
			}
		}
		return contador;
	}
	public boolean agregar(Animal a) {
		return catalogo.add(a);
	}
	
	public boolean muerte(Animal a) {
		return catalogo.remove(a);
	}

	@Override
	public String toString() {
		return "Zoo [catalogo=" + catalogo + "]";
	}
}
