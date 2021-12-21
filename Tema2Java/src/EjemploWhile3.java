import java.util.Scanner;

public class EjemploWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int contador=0;
		int fallos=0;
		int num;
		int max=0;
		while (contador<11) {
			System.out.println("Pon un número");
			num=sc.nextInt();
			if (num>19 & num<41) {
				if(num>max) {
					max=num;
				}
				contador++;
			}
			else {
				System.out.println("ERROR");
				fallos++;
			}
		}
		System.out.println("El mayor número introducido ha sido: "+max+" y el número de no válidos es: "+fallos);
		sc.close();
	}

}
