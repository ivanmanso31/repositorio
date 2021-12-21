import java.util.Scanner;

public class EjercicioArrays7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] numeros=new int[10];
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		numeros[0]=num;
		for (int i=1;i<numeros.length;i++){ 
			System.out.println("Introduce un número");
		    num=sc.nextInt();
			for (int j=0;j<i;j++) {
				if(num==numeros[j]) {
					System.out.println("Número no válido");
					i--;
					break;
				}
				else {
					numeros[i]=num;
				}
			}
		}
		for (int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i]+" ");
		}
		sc.close();
	}
}
