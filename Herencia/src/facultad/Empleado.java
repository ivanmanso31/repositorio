package facultad;

public class Empleado extends Persona {

	private int anyo;
	
	public Empleado(String id, String nombre, String apellidos, int anyo) {
		super(id, nombre, apellidos);
		this.anyo=anyo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return " id "+super.getId()+" Empleado [anyo=" + anyo + "]";
	}
	
}
