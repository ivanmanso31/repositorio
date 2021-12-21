
public class Empleado {

	private String nombre;
	private int telf;
	static int numEmpleados;
	
	public Empleado(String nombre, int telf) {
		this.nombre = nombre;
		this.telf = telf;
		numEmpleados++;
	}
	public static int getNumEmpleados() {
		return numEmpleados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelf() {
		return telf;
	}
	public void setTelf(int telf) {
		this.telf = telf;
	}
	public String toString() {
		return "Empleado [nombre=" + nombre + ", telf=" + telf + "]";
	}
	
	
}
