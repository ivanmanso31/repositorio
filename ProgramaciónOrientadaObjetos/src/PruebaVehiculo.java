import java.util.Scanner;

public class PruebaVehiculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehiculo v1;
		Vehiculo v2=new Vehiculo(5,50,5);
		v1=new Vehiculo();
		v1.informacion();
		v2.informacion();
		System.out.println("Cuántos km quieres recorrer");
		int km=sc.nextInt();
		double precioGasolina=1.12;
		System.out.println(v1.coste(precioGasolina, km));
		double precio=v2.coste(precioGasolina, km);
		System.out.println("Para v2 es "+precio);
		Vehiculo v3=new Vehiculo(3,2);
		v3.informacion();
		System.out.println(v3.coste(precioGasolina, km));
	}

}
