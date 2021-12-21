import java.util.Scanner;

public class EjercicioelseIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int n1=sc.nextInt();
		System.out.println("Introduce otro número");
		int n2=sc.nextInt();
		if (n1%2==0 && n2%2==0) {
			System.out.println(n1+" y "+n2+" ambos son pares");
		}
		else if (n1%2==0 && n2%2!=0) {
			System.out.println(n1+" el primero es par y "+n2+" es impar");
		}
		else if (n1%2!=0 && n2%2==0) {
			System.out.println(n1+" el primero es impar y "+n2+" es par");
		}
		else {
			System.out.println(n1+" y "+n2+" ambos son impares");
		}
		sc.close();
	}

}
