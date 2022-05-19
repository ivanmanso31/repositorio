package texto;

import java.io.*;

public class FicheroTextoLeer {

	public static void main(String[] args) {
		FileReader fic = null;
		try {
			fic = new FileReader("src\\misFicheros\\Restaurants.csv");
			int i;
			i = fic.read();
			while (i != -1) {
				char caracter = (char) i;
				System.out.print(caracter);
				i = fic.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error de apertura del fichero");
		} catch (IOException ex) {
			System.out.println("Error de lectura del fichero");
		} finally {
			try {
				fic.close();
			} catch (IOException ex) {
				System.out.println("no estaba abierto");
			}
		}
	}

}
