package texto;
import java.io.*;
import java.util.Scanner;
public class RellenarFichero {

	public static void main(String[] args) {
		String texto="";
		Scanner sc=new Scanner(System.in);
		try {
			BufferedWriter ficheroSalida= new BufferedWriter(new FileWriter(new File("src\\misFicheros\\fichero2.txt")));
			do {
				System.out.println("Introduzca el texto");
				texto=sc.nextLine();
				if(!texto.toUpperCase().equals("FIN")) {
					ficheroSalida.write(texto);
					ficheroSalida.newLine();
				}
			} while (!texto.toUpperCase().equals("FIN"));
			ficheroSalida.close();
			sc.close();
			
		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: "+errorDeFichero.getMessage());
		}
		System.out.println("FIN");
	}

}
