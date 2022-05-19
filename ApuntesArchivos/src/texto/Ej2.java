package texto;

import java.io.File;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el nombre");
		File ruta =new File(sc.next());
		System.out.print("Ruta: ");
		System.out.println(ruta.getPath());
		System.out.print("Ruta absoluta: ");
		System.out.println(ruta.getAbsolutePath());
		System.out.print("Tamaño: ");
		System.out.println(ruta.length());
		System.out.print("¿Se puede leer? ");
		System.out.println(ruta.canRead());
		System.out.print("¿Se puede escribir? ");
		System.out.println(ruta.canWrite());
		System.out.print("¿Es un archivo? ");
		System.out.println(ruta.isFile());
		System.out.print("¿Es un directorio? ");
		System.out.println(ruta.isDirectory());
	}

}
