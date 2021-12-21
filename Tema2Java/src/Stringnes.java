import java.util.Scanner;

public class Stringnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String nombre=sc.next();
		for(int i=0;i<nombre.length();i++) {
			System.out.println(nombre.charAt(i));
	}
		int e;
	    char letra;
	    String nom="hgfhgf";
	    System.out.println(nom.replace('f','a'));
	    System.out.println("Press S to stop.");
	    for (e = 0; (letra=sc.next().charAt(0)) != 'S'; e++) {
	        System.out.println("Pass #" + e);
	}
	    sc.close();
 }
}