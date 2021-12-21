import java.util.Scanner;

public class EjercicioArrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] numeros=new int[100];
		int num=101;
		int contador=0;
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=(int)(Math.random()*100+1);
		}
		while(num<0 | num>100) {
			System.out.println("Número que buscas");
			num=sc.nextInt();
		}
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]==i) {
				contador++;
				System.out.println("Aparece en la posición: "+i);
			}
		}
		if(contador>0) {
			System.out.println("El numero aparece "+contador+" veces");
		}
		else {
			System.out.println("No aparece");
		}
		sc.close();
	}

}
