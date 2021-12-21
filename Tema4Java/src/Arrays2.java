import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuántos elementos quieres");
		int size=Math.abs(sc.nextInt());
		int[] numeros=new int[size];
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=i*i;
			System.out.print(numeros[i]+"\t");
		}
		System.out.println();
		sc.close();
	}

}
