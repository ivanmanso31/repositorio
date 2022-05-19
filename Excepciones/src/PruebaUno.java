import java.util.Scanner;

public class PruebaUno {

	public static void main(String[] args) {
		String dato;
		Scanner sc=new Scanner (System.in);
		try { 
			System.out.println("dame un número");
			dato=sc.next();
			System.out.println (Uno.metodo(dato)); 
			} 
			catch (Exception e) { 
			System.out.println ("Excepcion en metodo ( ) " ); 
			e.printStackTrace ( ); 
			} 
	}
}