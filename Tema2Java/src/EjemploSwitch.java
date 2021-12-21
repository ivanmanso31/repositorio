import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una nota");
		int nota=sc.nextInt();
		switch (nota) {
		case 0,1,2,3,4: System.out.println(nota+" Suspenso");
			break;
		case 5: System.out.println(nota+" Aprobado");
			break;
		case 6: System.out.println(nota+" Bien");
			break;
		case 7,8: System.out.println(nota+" Notable");
			break;
		case 9,10: System.out.println(nota+" Sobresaliente");
			break;
		default: System.out.println(nota+" nota erronea");
		}
		sc.close();
	}

}
