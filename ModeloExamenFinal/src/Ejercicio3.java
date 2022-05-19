import java.util.*;
import java.time.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		LocalDate d=LocalDate.now();
		Map<String,LocalDate> mapa=new HashMap<String,LocalDate>();
		int op=1;
		String pais;
		do {
			System.out.println("1.añadirse 2.abandonar 3.salir ");
			op=sc.nextInt();
			switch(op) {
			case 1:{
				System.out.println("Pais para añadir");
				sc.nextLine();
				pais=sc.nextLine();
				mapa.put(pais, d.minusYears(10));
				break;
			}
			case 2:{
				System.out.println("Pais que abandona");
				sc.nextLine();
				pais=sc.nextLine();
				mapa.remove(pais);
				break;
			}
			case 3:{
				System.out.println("Adios");
				break;
			}
			default:{
				System.out.println("seleccion incorrecta");
				break;
			}
			}
		} while (op!=3);
		for (String clave : mapa.keySet()) {
			System.out.println(clave+"->"+mapa.get(clave));
		}
	}

}
