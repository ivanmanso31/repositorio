import java.util.Scanner;

public class EjercicioStrings8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe una cadena");
		String cad=sc.nextLine();
		String aux=new String(cad.toUpperCase());
		String[] trozos=aux.split(" ");
		String salida="";
		for(String subcadena:trozos) {
			salida += subcadena;
		}
		System.out.println(cad);
		System.out.println(salida);
		sc.close();
	}

}
