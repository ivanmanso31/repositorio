package pq2;

import java.util.Scanner;

public class PruebaVotacion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Votacion v1=new Votacion();
		int op;
		do {
			System.out.println("1.añadir votos 2.mostrar votacion 3.acabar votacion 4.Salir");
			op=sc.nextInt();
			switch(op) {
			case 1:
				String voto="";
				while(voto!="fin") {
					if(voto=="fin") {
						break;
					}
					else {
						System.out.println("A quien va el voto?");
						voto=sc.next();
						v1.añadirVoto(voto);
					}
				}
				break;
			case 2:
				System.out.println(v1);
				break;
			case 3:
				v1.acabarVotacion();
				System.out.println(v1);
				break;
			case 4:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (op!=4 && op!=3);
		System.out.println("FIN");
		sc.close();
	}

}


