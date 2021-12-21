import java.util.Scanner;

public class EjEntradaTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe un entero");
		int v=teclado.nextInt();
		int t=v++;
		System.out.println(t);
		System.out.println(v);
		System.out.println("Ahora introduce un numero con decimales");
		double var1=teclado.nextDouble();
		System.out.println(var1);
		System.out.println("true o false");
		boolean b=teclado.nextBoolean();
		if(b) {
			double n1=(int) (Math.random()*100+1);
			System.out.println(n1);
		}
		else {
			System.out.println("La clase ha terminado");
		}
		System.out.println("Escribe algo sin espacios");
		String cad=teclado.next();
		System.out.println(cad);
		System.out.println("Ahora con espacios");
		String cad1=teclado.nextLine();
		System.out.println(cad1);
		teclado.close();
	}

}
