package texto;

import java.io.*;

public class PruebaLeerFichero {

	public static void main(String[] args) {
		if ((new File("src\\misFicheros\\Restaurants.csv")).exists()) {
			try {
				BufferedReader ficheroEntrada = new BufferedReader(
						new FileReader(new File("src\\misFicheros\\Restaurants.csv")));
				String linea=null;
				  while ((linea=ficheroEntrada.readLine()) != null) {
		                System.out.println(linea);
		            }
		 
		            ficheroEntrada.close();
			} catch (IOException errorDeFichero) {
				System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
			}
		} else {
			System.out.println("No he encontrado fichero.txt");
			return;
		}

	}

}
