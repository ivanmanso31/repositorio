import java.util.Scanner;

public class EjemploWhile5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int unidades=1;
		double precio=0;
		double total=0;
		while (unidades!=0) {
			System.out.println("precio del producto");
			precio=sc.nextDouble();
			System.out.println("Unidades del producto");
			unidades=sc.nextInt();
			total=total+(precio*unidades);
		}
		if (total>1000) {
			total=total-(total*5/100);
		}
		System.out.println("El precio final es: "+total);
		sc.close();
	}

}
