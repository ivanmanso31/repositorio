package modelo;

import java.util.Arrays;

public class Viajante {

	private String nombre;
	private int nivel;
	private String [] ciudades=new String [3];
	
	public Viajante(String nombre) {
		this.nombre = nombre;
		this.nivel=0;
		this.ciudades=new String [3];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String[] getCiudades() {
		return ciudades;
	}

	public void setCiudades(String[] ciudades) {
		this.ciudades = ciudades;
	}
	
	public void añadirCiudad(String ciudad) {
		boolean control=false;
		for (int i = 0; i < ciudades.length; i++) {
			if(ciudades[i]==null) {
				ciudades[i]=ciudad;
				control=true;
				break;
			}
		}
		if(control==false) {
			for (int i = 0; i < ciudades.length; i++) {
				ciudades[i]=null;
			}
			nivel++;
			añadirCiudad(ciudad);
		}
	}
	@Override
	public boolean equals(Object obj) {
		Viajante v=(Viajante)obj;
		if(v.nombre.equals(nombre)) {
			return true;
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "\n"+"Viajante [nombre=" + nombre + ", nivel=" + nivel + ", ciudades=" + Arrays.toString(ciudades) + "]";
	}
	
	
	
}
