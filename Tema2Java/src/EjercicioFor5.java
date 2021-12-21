import java.util.Scanner;

public class EjercicioFor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		for (int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.println(i+" es divisor de "+num+" y da: "+(num/i));
			}
		}
		System.out.println("FIN");
		sc.close();
	}

}
