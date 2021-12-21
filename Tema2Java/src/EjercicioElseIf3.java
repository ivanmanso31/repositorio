import java.util.Scanner;

public class EjercicioElseIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mayor;
		int medio;
		int menor;
		System.out.println("Introduce un número");
		int n1=sc.nextInt();
		mayor=n1;
		System.out.println("Introduce otro número");
		int n2=sc.nextInt();
		if (n2>=mayor) {
			medio=mayor;
			mayor=n2;
		}
		else {
			medio=n2;
		}
		System.out.println("Y otro");
		int n3=sc.nextInt();
		if (n3<=medio) {
			menor=n3;
		}
		else if (n3<=mayor && n3>=medio) {
			menor=medio;
			medio=n3;
		}
		else {
			menor=medio;
			medio=mayor;
			mayor=n3;
		}
		System.out.println("el orden es: "+mayor+" "+medio+" "+menor);
		sc.close();
	}

}
