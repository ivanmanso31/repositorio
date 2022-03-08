package pq1;

public class Persona  implements Cloneable{

	private String dni;
	private String nombre;
	
	public Persona(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public boolean equals(Object obj) {
		Persona p=(Persona)obj;
		if(p.dni.equals(this.dni) && p.nombre.equals(this.nombre)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	@Override
	public Persona clone() {
		 Persona c = new Persona(this.dni,this.nombre);
	      return c;
	}
}
