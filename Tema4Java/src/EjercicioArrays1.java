import java.util.Scanner;

public class EjercicioArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] numeros=new int[10];
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.println("Introduce un número");
			int num=sc.nextInt();
			numeros[i]=num;
			
		}
		for(int i=0;i<numeros.length;i++) {
		System.out.print(numeros[i]+"\t");
		sc.close();
	}
	}
}
