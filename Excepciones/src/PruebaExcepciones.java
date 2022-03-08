import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaExcepciones {
	
	public static int recogeNumero() {
		Scanner sc=new Scanner(System.in);
		int var=0;
		System.out.println("Dame un número");
		try {
		var=sc.nextInt();
		sc.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Catch dentro del metodo");
		}
		return var;
	}

	public static void main(String[] args) {
		
		int n=0,t=0;
		try {
		n=recogeNumero();
		t=10/n;
		System.out.println("t vale "+t);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Has intentado dividir entre 0, no se puede");
			n=1;
			t=10/n;
		} catch(InputMismatchException e1) {
			System.out.println(e1.getMessage());
			System.out.println("El dato no es entero");
			System.out.println("Catch en el main");
			t=10;
		} catch(Exception e2) {
			System.out.println(e2.getMessage());
			System.out.println("Otra cosa");
		}
		System.out.println("n vale "+n);
		System.out.println("t vale "+t);
		System.out.println("fin de programa");

	}

}
