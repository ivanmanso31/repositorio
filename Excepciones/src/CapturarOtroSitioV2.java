import java.util.InputMismatchException;
import java.util.Scanner;

public class CapturarOtroSitioV2 {

	public static int devuelveNumero() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		return sc.nextInt();
	}
	
	public static void dibujaCuadrado() {
		int lado=devuelveNumero();
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void dibujaCuadrado(int lado) {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		try {
			dibujaCuadrado();
		}catch (InputMismatchException e) {
			System.out.println("no se ha obtenido un numero entero");
		}
		System.out.println("FIN");
	}

}