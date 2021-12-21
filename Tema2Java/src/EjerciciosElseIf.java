import java.util.Scanner;

public class EjerciciosElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int n1=sc.nextInt();
		System.out.println("Introduce otro número");
		int n2=sc.nextInt();
		System.out.println("Y otro");
		int n3=sc.nextInt();
		if (n1<=n2 && n1<=n3) {
			System.out.println(n1+" es el menor");
		}
		else if (n2<=n3) {
			System.out.println(n2+" es el menor");
		}
		else {
			System.out.println(n3+ " es el menor");
		}
		sc.close();
	}

}
