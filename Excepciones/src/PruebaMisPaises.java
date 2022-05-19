import java.util.Scanner;

public class PruebaMisPaises implements misPaises {

	public static void presenta(boolean[] misDatos) {
		for (int i = 0; i < paises.length; i++) {
			try {
				if (misDatos[i]) {
					System.out.println("felicidades conoces " + paises[i]);
				}
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("no sabemos si has visitado "+paises[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String res;
		int r;
		boolean[] paisesVisitados = new boolean[3];
		try {
			for (int i = 0; i < paises.length; i++) {
				System.out.println("has visitado " + paises[i] + " S/N o 1/0");
				res = sc.next().toUpperCase();
				r=Integer.parseInt(res);
				if (r==1 || res=="S") {
					paisesVisitados[i] = true;
				}
			}
			
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("los dos arrays no tienen el mismo numero de elementos");
		} catch (NumberFormatException ex) {
			System.out.println("respuesta incorrecta");
		} finally {
			System.out.println("Se ejecuta siempre");
			presenta(paisesVisitados);
		}
		System.out.println("fin");
	}
}