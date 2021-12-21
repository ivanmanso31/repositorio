import java.util.Scanner;

public class EjercicioIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero");
		int v=sc.nextInt();
		if(v%2==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		System.out.println("Escribe otro numero");
		int t=sc.nextInt();
		if(t%3==0) {
			System.out.println("Ni el anterior ni el posterior son multiplos de 3");
		}
		else { 
			if((t-1)%3==0) {
				System.out.println("El anterior es multiplo de 3");
		}
			else {
				System.out.println("El posterior es multiplo de 3");
		}}
		System.out.println("Ahora escribe un boolean");
		boolean b1=sc.nextBoolean();
		System.out.println("Ahora escribe otro");
		boolean b2=sc.nextBoolean();
		if(b1!=b2) {
			System.out.println("Siguen la cadena");
		}
		else {
			System.out.println("No siguen la cadena");
		}
		sc.close();
	}

}
