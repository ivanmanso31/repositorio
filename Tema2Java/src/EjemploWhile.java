import java.util.Scanner;

public class EjemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int aux=0;
		int num;
		int contador=0;
		while (aux<=100) {
			System.out.println("Introduce un n�mero");
			num=sc.nextInt();
			System.out.println(num);
			aux=aux+num;
			contador++;
		}
		System.out.println("Has introducido "+contador+" n�meros y la suma de ellos da: "+aux);
		sc.close();
	}
	

}
