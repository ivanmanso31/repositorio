import java.util.InputMismatchException;
import java.util.Scanner;

public class CapturarOtroSitio {

	public static int devuelveNumero() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		try {
			int n=devuelveNumero();
			for (int i=0; i<n ; i++) {
				System.out.println(i);
			}
		}catch (InputMismatchException e) {
			System.out.println("no se ha obtenido un numero entero");
		}
		System.out.println("FIN");
	}

}
