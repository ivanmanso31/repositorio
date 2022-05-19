package texto;

import java.io.*;
import java.util.Scanner;

public class PruebaAlumnoF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if ((new File("src\\misFicheros\\Alumnos.txt")).exists()) {
			try {
				BufferedReader ficheroEntrada = new BufferedReader(
						new FileReader(new File("src\\misFicheros\\Alumnos.txt")));
				String linea = null;
				System.out.println("Dni que buscas");
				String dni = sc.next();
				while ((linea = ficheroEntrada.readLine()) != null) {
					String[]partes=linea.split(" : ");
					
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
