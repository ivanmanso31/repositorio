import java.util.Scanner;

public class EjercicioFor9 {

	public static void main(String[] args) {
		// calculo de un numero primo
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		boolean b=true;//es primo mientras no se demuestre lo contrario
		for (int i=num-1;i>1;i--) {
			if(num%i==0) {
				System.out.println(num+" no es primo");
				b=false;
				break;
			}
		}
		if(b) {
		System.out.println("Es primo");
		}
		System.out.println("FIN");
		sc.close();
	}

}
