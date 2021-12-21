import java.util.Scanner;

public class EjemploWhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=0;
		int contador=0;
		int numA=(int)(Math.random()*100+1);
		
		do {
			System.out.println("Intenta adivinar el número");
			num=sc.nextInt();
			if (num==numA | contador==9) {
				break;
			}
			else if (num<numA){
				System.out.println("Más alto");
			}
			else {
				System.out.println("Más bajo");
			}
			contador++;
		}
		while (contador<10);
	
		if (num==numA) {
			System.out.println("Has ganado");
		}
		else {
			System.out.println("Has perdido, el número era: "+numA);
		}
		sc.close();
	}
}
