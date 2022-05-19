
public class Persona {

	private String dni;
	private String nombre;
	private int edad;
	private Direccion dir;
	
	public Persona(String dni, String nombre, int edad, Direccion dir) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.dir = dir;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Direccion getDir() {
		return dir;
	}

	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	public void quienSoy() {
		System.out.println("Soy una persona");
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", dir=" + dir + "]";
	}
	
}
