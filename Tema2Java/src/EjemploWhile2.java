import java.util.Scanner;

public class EjemploWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=0;
		int num2=1;
		int contador=0;
		while (num!=num2 || contador<2) {
			num2=num;
			System.out.println("Escribe un número");
			num=sc.nextInt();
			contador++;
			
		}
		System.out.println("Son iguales");
		sc.close();
	}

}
