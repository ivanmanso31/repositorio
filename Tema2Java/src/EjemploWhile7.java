import java.util.Scanner;

public class EjemploWhile7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuántas notas va a introducir");
		int notas=sc.nextInt();
		System.out.println("Nota de corte");
		double corte=sc.nextDouble();
		int contador=0;
		for(int i=0;i<notas;i++) {
			System.out.println("Introduce nota");
			double nota=sc.nextDouble();
			if(nota>=corte) {
				contador++;
			}
		}
		System.out.println(contador+" notas han superado la nota de corte");
		sc.close();
	}

}
