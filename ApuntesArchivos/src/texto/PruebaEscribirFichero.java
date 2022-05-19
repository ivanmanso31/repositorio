package texto;
import java.io.*;

public class PruebaEscribirFichero {

	public static void main(String[] args) {
		System.out.println("volcando datos a un archivo");
		try {
			BufferedWriter ficheroSalida= new BufferedWriter(new FileWriter(new File("src\\misFicheros\\fichero.txt")));
			ficheroSalida.write("Hola estoy de vuelta");
			ficheroSalida.newLine();
			ficheroSalida.write("que tal las vacaciones");
			ficheroSalida.newLine();
			ficheroSalida.close();
		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: "+errorDeFichero.getMessage());
		}
		
	}

}
