import java.util.Scanner;

public class EjercicioDibujoCuadrado {
	public static void hueco(int altura,int base) {
		for(int i=1;i<=altura;i++) {
			if(i==1 | i==altura) {
				for(int j=0;j<base;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {
				System.out.print("* ");
				for(int k=1;k<(base-1);k++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}
		}
	}
	public static void relleno(int altura,int base) {
		for(int i=0;i<altura;i++) {
			for(int j=0;j<base;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void linea(char caracter,int longitud) {
		for(int i=0;i<longitud;i++) {
			System.out.print(caracter+" ");
		}
		System.out.println();
	}
	public static void rectanguloChar(int altura,int base, char caracter) {
		for(int i=0;i<altura;i++) {
			linea(caracter,base);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Altura");
		int altura=sc.nextInt();
		System.out.println("Base");
		int base=sc.nextInt();
		System.out.println("Símbolo");
		char caracter=sc.next().charAt(0);
		hueco(altura,base);
		System.out.println();
		relleno(altura,base);
		System.out.println();
		rectanguloChar(altura,base,caracter);
		sc.close();
	}

}
