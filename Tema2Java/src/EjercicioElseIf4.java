import java.util.Scanner;

public class EjercicioElseIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int n1=sc.nextInt();
		System.out.println("Introduce otro número");
		int n2=sc.nextInt();
		if (n1==n2) {
			System.out.println("Son iguales");
		}
		else if (n1%n2==0) {
			System.out.println(n1+" es multiplo de "+n2);
		}
		else if(n2%n1==0) {
			System.out.println(n2+" es multiplo de "+n1);
		}
		else {
			System.out.println("Ni son iguales ni son multiplos");
		}
		sc.close();
	}

}
