import java.util.Scanner;

public class ejercicioStrings5 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner sc=new Scanner(System.in);
		String cad;
		int posicion;
		System.out.println("Escribe una cadena");
		cad=sc.nextLine();
		do {
			
			posicion=cad.indexOf(" ");
		if (posicion>-1) {
			System.out.println(cad.substring(0, posicion));
			cad=cad.substring(posicion+1);
		}
		}while(posicion!=-1);
		System.out.println(cad);
		sc.close();
		}

}
