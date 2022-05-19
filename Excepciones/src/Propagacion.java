import java.util.InputMismatchException;
import java.util.Scanner;

public class Propagacion {

	private static int recogeEntero() {
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("Introduce un número");
		try {
			num=sc.nextInt();
			if(num<0 || num>10) {
				throw new ExcsPropias2("fuera de rango");
			}
		}catch (InputMismatchException ex) {
			System.out.println("recogeEntero");
			
		}catch (ExcsPropias2 ex) {
			try {
				if (num<0) {
					throw new PorDebajoLim("nota inferior a 0");
				}else if(num>10) {
					throw new PorEncimaLim("nota superior a 10");
				}
			}catch (PorDebajoLim e) {
				num=0;
			}catch (PorEncimaLim e) {
				num=10;
			}
		}
		return num;		
	}
	private static int calculaMedia(int numEv) {
		int media=0;
		for (int i = 0; i<numEv ; i++) {
			try {
				media+=recogeEntero();
			}catch (InputMismatchException ex) {
				System.out.println("calculaMedia");
				media+=5;
			}
			
		}
		media/=numEv;
		return media;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("tu media es "+calculaMedia(3));
		}catch (InputMismatchException ex) {
			System.out.println("no se puede calcular (main)");
		}
		System.out.println("FIN");

	}

}
