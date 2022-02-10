import java.util.ArrayList;
import java.util.Scanner;


public class GestionLLamadas {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> llamadas= new ArrayList<String>();
		int op=1,contador=0;
		while (op>0) {
			System.out.println("(1)Aceptar ,(0)Terminar");
			op=sc.nextInt();
			if(op==1 && contador<10) {
				System.out.println("Quien eres");
				String nb=sc.next();
				llamadas.add(nb);
				contador++;
			}
			else {
				System.out.println("Fin");
				op=0;
			}
		}
		for (int i = 0; i < llamadas.size(); i++) {
			System.out.println(llamadas.get(i));
		}
		if(llamadas.contains("juan")) {
			System.out.println("juan ha obtenido el premio");
		}
		else {
			System.out.println("juan no ha obtenido el premio");
		}
	}

}
