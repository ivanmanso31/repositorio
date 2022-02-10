
public class Cantante {

	private String nombre;
	private String disco;
	
	public Cantante(String nombre, String disco) {
		super();
		this.nombre = nombre;
		this.disco = disco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", disco=" + disco + "]";
	}
	
}
