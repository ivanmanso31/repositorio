package pq2;

public class Candidato implements Cloneable {

	private String nombre;
	private int votos=1;
	
	public Candidato(String nombre) {
		this.nombre = nombre;
	}
	public void añadirVoto() {
		votos++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	@Override
	public boolean equals(Object obj) {
		Candidato c=(Candidato)obj;
		if(c.nombre.equals(nombre)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Candidato [nombre=" + nombre + ", votos=" + votos + "]"+"\n";
	}
	@Override
	public Candidato clone() {
		 Candidato c = new Candidato(this.nombre);
	      return c;
	}
	
	
}
