import java.util.Scanner;

public class rango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Que temperatura hace?");
		int temperatura=sc.nextInt();
		if (temperatura<10) {
			System.out.println("Clima frio");
		}
		else if(temperatura<26) {
			System.out.println("Clima templado");
		}
		else if(temperatura<36) {
			System.out.println("Clima caluroso");
		}
		else {
			System.out.println("Clima tropical");
		}
		sc.close();
	}

}
