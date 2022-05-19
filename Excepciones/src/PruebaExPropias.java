import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaExPropias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String notaCad;
		int nota = 0;
		try {
			System.out.println("intro nota (numero)");
			nota = sc.nextInt();
			if (nota > 10 || nota < 0) {
				throw new ExcsPropias2("nota fuera de rango");
			}
			notaCad=pasaNota(nota);
			System.out.println("tu nota es "+nota);
			System.out.println("tienes un "+notaCad);
		} catch (ExcsPropias2 ex) {
			System.out.println(nota + " " + ex.getMessage());
		}catch (InputMismatchException ex) {
			System.out.println("El valor no es entero ");
		}finally {
			sc.close();
		}
		System.out.println("FIN");
	}

	private static String pasaNota(int nota) {
		switch(nota) {
		case 0,1,2,3,4:
			return "suspenso";
		case 5,6:
			return "Bien";
		case 7,8:
			return "Notable";
		case 9,10:
			return "Sobresaliente";
		default:
			return "nota invalida";
		}
	}
}
