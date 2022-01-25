package pq1;

public class DemoProtected {

	protected void mostrarP() {
		System.out.println("Estudio java");
	}
	
	public String xxP() {
		mostrarP();
		DemoDefault d=new DemoDefault();
		d.mostrarD();
		String salida="con gusto";
		return salida;
	}
}
