import java.util.Scanner;

public class EjercicioStrings5V2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cad;
		System.out.println("Escribe una cadena");
		cad=sc.nextLine();
		String[] trozos=cad.split(" ");
		for(String subcadena:trozos) {
			System.out.println(subcadena);
		}
		sc.close();
	}
}


