package modelo;

import java.util.Scanner;

public class PruebaViajantes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Departamento d1=new Departamento();
		int op;
		do {
			System.out.println("1.a�adir viajante 2.a�adir viaje. 3.ver mejor viajante.4 ver dto.5 salir");
			op=sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Nombre del viajante que quiere a�adir");
				String nombre=sc.next();
				System.out.println(d1.a�adirViajante(nombre));
				System.out.println(d1);
				break;
			case 2:
				System.out.println("Nombre del viajante al que quiere a�adir la ciudad");
				nombre=sc.next();
				System.out.println("Ciudad que quiere a�adir");
				String ciudad=sc.next();
				System.out.println(d1.a�adirCiudad(ciudad,nombre));
				System.out.println(d1);
				break;
			case 3:
				d1.mejorViajante();
				break;
			case 4:
				System.out.println(d1);
				break;
			case 5:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (op!=5);
		System.out.println("FIN");
		sc.close();
	}

}


