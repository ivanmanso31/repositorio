import java.util.Scanner;

public class EjercicioStrings7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String vocales="aeiou";
		int contador=0;
		System.out.println("Escribe una cadena");
		String cad=sc.nextLine();
		for(int i=0;i<vocales.length();i++) {
			for(int j=0;j<cad.length();j++) {
				if(cad.charAt(j)==vocales.charAt(i)) {
					contador++;
					break;
				}
			}
			
			
		}
		if(contador==5) {
			System.out.println("Contiene todas las vocales");
		}
		else {
			System.out.println("No contiene todas las vocales");
		}
		sc.close();
		
	}

}
