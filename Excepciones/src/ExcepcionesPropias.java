import java.util.ArrayList;
import java.util.Scanner;

public class ExcepcionesPropias implements Palabras {

	public static boolean analiza(String micomen) {
		boolean malicioso = false;
		for (int i = 0; i < palabra.length; i++) {
			if (micomen.contains(palabra[i])) {
				malicioso = true;
				break;
			}
		}
		return malicioso;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String comentario = "";
		ArrayList<String> comen = new ArrayList<String>();
		try {
			do {
				System.out.println("Introduce tu comentario");
				try {
					comentario = sc.nextLine();
					if (analiza(comentario.toLowerCase())) {
						throw new ExcepcionPalabra("tu comentario es malicioso");
					}
					comen.add(comentario);
				} catch (ExcepcionPalabra ex) {
					System.out.println(ex.getMessage());
				}
			} while (!comentario.equals("11"));
			comen.remove("11");
			for (int i = 0; i < comen.size(); i++) {
				System.out.println(comen.get(i));
			}
		}catch (Exception e){
			System.out.println("Ocurrio algo inesperado");
		} finally {
			sc.close();
		}
		System.out.println("FIN");

	}

}
