import java.util.ArrayList;

public class Alumno  extends Persona{

	private ArrayList<String> estudios;
	
	public Alumno(String dni, String nombre, int edad, Direccion dir, String estudio) {
		super(dni, nombre, edad, dir);
		this.estudios=new ArrayList<String>();
		estudios.add(estudio);
	}

	public void añadirEstudio(String estudio) {
		estudios.add(estudio);
	}
	@Override
	public void quienSoy() {
		System.out.println("Soy un alumno");
	}
	@Override
	public String toString() {
		return "Alumno [estudios=" + estudios + "]";
	}

	
}
