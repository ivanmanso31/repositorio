import java.util.Scanner;

public class EjercicioAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Quieres el area de un rectangulo (1) o un cuadrado (2)?");
		int eleccion=sc.nextInt();
		if(eleccion==1) {
			System.out.println("Introduce la base del ractangulo");
			double base=sc.nextDouble();
			System.out.println("Ahora introduce la altura");
			double altura=sc.nextDouble();
			System.out.println("El area de tu rectangulo es: "+base*altura);
	}
		else {
			if(eleccion==2) {
				System.out.println("Introduce el lado de tu cuadrado");
				double lado=sc.nextDouble();
				System.out.println("El area de tu cuadrado es: "+lado*lado);
		}
			else {
				System.out.println("Por favor seleccione 1 o 2");
		}
		sc.close();
	}
}
}