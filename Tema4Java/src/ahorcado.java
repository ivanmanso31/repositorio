import java.util.Scanner;

public class ahorcado {
	private static void verArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
			}
			System.out.println();
	}
	private static boolean esPalabra(String palabra1, String palabra2) {
		if(palabra1.equals(palabra2)) {
			return true;
		}
		else {
			return false;
		}
	}
	private static boolean esChar(char char1, char char2) {
		if(char1==char2) {
			return true;
		}
		else {
			return false;
		}
	}
	private static boolean esArray(char[] array1,char[] array2) {
		boolean control=true;
		for(int i=0;i<array1.length;i++) {
			if(!esChar(array1[i],array2[i])) {
				control= false;
			}
		}
		return control;
	}
	private static void dibujo(int num) {
		switch(num) {
		case 6: 
			System.out.println();
			break;
		case 5:
			System.out.println(" 0 ");
			break;
		case 4:
			System.out.println(" 0 ");
		 	System.out.println(" | ");
		 	break;
		case 3:
			System.out.println(" 0 ");
		 	System.out.println("/| ");
		 	break;
		case 2:
			System.out.println(" 0 ");
		 	System.out.println("/|/");
		 	break;
		case 1:
			System.out.println(" 0 ");
		 	System.out.println("/|/");
		 	System.out.println("/  ");
		 	break;
		case 0:
			System.out.println(" 0 ");
		 	System.out.println("/|/");
		 	System.out.println("// ");
		 	break;
		default:
			break;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] palabra;
		char[] respuesta;
		int vidas=6;
		boolean control;
		System.out.println("Jugador 1 escribe tu palabra");
		String pal=sc.next().toUpperCase();
		palabra=new char[pal.length()];
		respuesta=new char[pal.length()];
		for(int i=0;i<pal.length();i++) {
			palabra[i]=pal.charAt(i);
		}
		for(int i=0;i<pal.length();i++) {
			respuesta[i]='_';
		}
		for(int i=0;i<50;i++) {
			System.out.println();
		}
		System.out.println("Jugador 2 te toca adivinar");
		verArray(respuesta);
		while(vidas>0) {
			control=false;
			System.out.println("Letra que quieres buscar");
			char letra=sc.next().toUpperCase ().charAt(0);
			for(int i=0;i<pal.length();i++) {
				if(esChar(palabra[i],letra)) {
					respuesta[i]=letra;
					control=true;
				}
			}
				
			if(control) {
				verArray(respuesta);
				System.out.println();
				dibujo(vidas);
			}
			else {
				System.out.println("Mal");
				vidas=vidas-1;
				dibujo(vidas);
				System.out.println();
				verArray(respuesta);
			}
			if(esArray(palabra,respuesta)) {
				System.out.println("Palabra acertada, vidas restantes: "+vidas);
				break;
			}
			System.out.println("Vidas: "+vidas);
			System.out.println();
			
		}
		if(esArray(palabra,respuesta)) {
			System.out.println("Fin");
		}
		else {
			System.out.println("Intenta adivinar la palabra");
			String res=sc.next().toUpperCase();
			if(esPalabra(res,pal)) {
				System.out.println("Correcto");
			}
			else {
				System.out.println("Has perdido, la palabra era: ");
				verArray(palabra);
			}
			System.out.println("Fin");
		}
		sc.close();
	
	}
}
