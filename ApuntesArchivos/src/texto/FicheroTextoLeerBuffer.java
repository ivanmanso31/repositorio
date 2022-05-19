package texto;

import java.io.*;
import java.util.Arrays;

public class FicheroTextoLeerBuffer {

	public static void main(String[] args) {
		FileReader fic = null;
		try {
			fic = new FileReader("src\\misFicheros\\Restaurants.csv");
			int i;
			char array[] =new char[20];
			while ((i =fic.read(array))!=-1)  {
				System.out.print(array);
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