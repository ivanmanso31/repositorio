import java.util.Scanner;

public class tablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("¿De qué número quieres la tabla?");
		int num=sc.nextInt();
		for(int i=0;i<11;i++){
			System.out.println(num+" x "+i+" = "+num*i);
		}
		sc.close();
	}

}
