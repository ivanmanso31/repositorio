package texto;

import java.io.*;

public class FicheroTextoEscribir {

	public static void main(String[] args) {
		File fichero = new File("src\\misFicheros\\f33.txt");
		try {
			FileWriter ficheroW = new FileWriter(fichero);
			String frase1="me gusta viajar";
			String frase2="me gusta el cine";
			ficheroW.write(frase1+"\n");
			ficheroW.write(frase2);
			ficheroW.close();
		} catch (IOException e) {
			System.out.println("se produjo un error");
		}

	}

}
