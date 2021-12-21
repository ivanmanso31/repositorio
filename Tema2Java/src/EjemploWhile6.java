import java.util.Scanner;

public class EjemploWhile6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=1;
		int aux;
		int cadena;
		System.out.println("Cuántos números de la serie quieres");
		cadena=sc.nextInt();
		cadena=Math.abs(cadena);
		//cadena = Math.abs(sc.nextInt());
		for(int i=0;i<cadena;i++) {
			System.out.print(num2+" ");
			aux=num2+num1;
			num1=num2;
			num2=aux;
		}
		System.out.println("FIN");
		sc.close();
	}

}
