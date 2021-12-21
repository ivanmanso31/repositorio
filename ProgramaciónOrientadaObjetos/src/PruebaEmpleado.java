
public class PruebaEmpleado {

	public static void main(String[] args) {
		Empleado p1=new Empleado("pepe",12345678);
		Empleado p2=new Empleado("sara",87654321);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("hay "+Empleado.getNumEmpleados()+" empleados");

	}

}
