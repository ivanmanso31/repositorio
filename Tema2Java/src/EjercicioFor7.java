import java.util.Scanner;

public class EjercicioFor7 {

	public static void main(String[] args) {
		//Calculo de factorial
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		int resultado=num;
		for (int i=num-1;i>0;i--) {
			resultado=resultado*i;
		}
		System.out.println("El factorial de "+num+" es "+resultado);
		resultado=1;
		for (int i=2;i<num+1;i++) {
			resultado=resultado*i;
		}
		System.out.println("El factorial de "+num+" es "+resultado);
		System.out.println("FIN");
		sc.close();
	}

}
