package texto;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		File f = new File("src\\misFicheros\\Restaurants.csv");
		Scanner sc = new Scanner(System.in);
		String cad;
		String linea;
		System.out.println("Cadena a buscar");
		cad = sc.next();
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader fbr = new BufferedReader(fr);
			try {
				while ((linea = fbr.readLine()) != null) {
					String[] datos = linea.split(",");
					if (datos[datos.length-1].startsWith(cad)) {
						System.out.print("empieza por "+cad);
						System.out.println(" "+linea);
					}
					if (datos[datos.length-1].endsWith(cad)) {
						System.out.print("termina por "+cad);
						System.out.println(" "+linea);
					}
					else if (datos[datos.length-1].contains(cad)) {
						System.out.print("contiene "+cad);
						System.out.println(" "+linea);
					}
				}
				
			} catch (IOException e) {
				System.out.println("Fallo de lectura");
			}
			try {
				fbr.close();
			} catch (IOException e) {
				
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
		finally {
			
		}

	}

}
