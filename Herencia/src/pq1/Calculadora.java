package pq1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculadora Universal");
		int op=0;
		double valor1,valor2;
		do {
			System.out.println("Introduce valor1");
			valor1=sc.nextDouble();
			System.out.println("Introduce valor2");
			valor2=sc.nextDouble();
			System.out.println("Operacion a realizar: Suma(0) Resta(1) Multiplicacion(2) Division(3) Salir(4) ");
			op=sc.nextInt();
			switch(op) {
			case 0:
				Suma s=new Suma(valor1, valor2);
				System.out.println(s.operar());
				System.out.println();
				break;
			case 1:
				Resta r=new Resta(valor1, valor2);
				System.out.println(r.operar());
				System.out.println();
				break;
			case 2:
				Multiplicacion m=new Multiplicacion(valor1, valor2);
				System.out.println(m.operar());
				System.out.println();
				break;
			case 3:
				Division d=new Division(valor1, valor2);
				System.out.println(d.operar());
				System.out.println();
				break;
			case 4:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (op>-1 && op<4);
		System.out.println("FIN");
		sc.close();
	}

}
