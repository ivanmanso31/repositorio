import java.util.Scanner;

public class PruebaPasswordAlumnos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos alumnos hay?");
		int num=sc.nextInt();
		System.out.println("¿Qué longitud tienen las claves?");
		int tam=sc.nextInt();
		PasswordAlumnos p1=new PasswordAlumnos(num,tam);
		System.out.println(p1.toString());

	}

}
