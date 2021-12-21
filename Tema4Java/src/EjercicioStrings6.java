import java.util.Scanner;

public class EjercicioStrings6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe una cadena");
		String cad=sc.nextLine().toLowerCase();
		String vocales="aeiou";
		int contador=0;
		for(int i=0;i<cad.length();i++) {
			for(int j=0;j<vocales.length();j++) {
				if(cad.charAt(i)==vocales.charAt(j)) {
					contador++;
				}
			}
		}
		System.out.println("hay "+contador+" vocales");
		sc.close();
	}

}
