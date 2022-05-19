package ejRepaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaAdivinaNumero {

	public static void main(String[] args) {
		AdivinaNumero a1=new AdivinaNumero();
		boolean acierto=false;
		Scanner sc =new Scanner(System.in);
		int respuesta=0;
		do {
			System.out.println("Intenta adivinar el numero entre 1 y 500");
			try {
				
				respuesta=sc.nextInt();
				acierto=a1.intento(respuesta);
			}catch(InputMismatchException e) {
				sc.next();
				System.out.println("Eso no es un int");
				a1.setContador(a1.getContador()+1);
			}finally {
				System.out.println("Intentos "+a1.getContador()+"\n");
			}
		} while (!acierto);
		System.out.println("Enhorabuena has acertado "+a1.getNum()+" en "+a1.getContador()+" intentos");

	}

}
