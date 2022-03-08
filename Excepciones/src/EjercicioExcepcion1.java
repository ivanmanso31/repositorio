import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioExcepcion1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		boolean control=true;
		int num=0;
		do {
			try {
				System.out.println("Número que quieres introducir");
				num=sc.nextInt();
				a1.add(num);
			} catch(InputMismatchException e1) {
				System.out.println(e1.toString());
				System.out.println("El dato no es entero");
				control=false;
			}
		}while (control!=false);
		System.out.println("Cantidad de números introducidos "+a1.size());
		System.out.println("Números introducidos:");
		for (int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i)+" ");
		}
	}

}
