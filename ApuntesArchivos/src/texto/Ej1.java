package texto;

import java.io.File;
import java.util.Scanner;

public class Ej1 {

	private static String[] extraeFichero(String miruta) {
		File ruta = new File(miruta);
		if(ruta.exists() && ruta.isDirectory()) {
			String[] salida =ruta.list();
			return salida;
		}
		
		return null;
				
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la ruta absoluta");
		try {
			String miruta = sc.next();
			String[] misFicheros = extraeFichero(miruta);

			for (String s : misFicheros) {
				System.out.println(s);
			}
		} catch (NullPointerException e) {
			System.out.println("no hay extraccion de datos");
		} catch (Exception e1) {
			System.out.println("Algo esta muy mal");
		}
		System.out.println("FIN");
	}

}
