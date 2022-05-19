import java.util.Scanner;

public class Ej3Ex {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("intro palabra");
		String palabra=sc.nextLine();
		try {
			System.out.println("tu frase era "+palabra);
			if (palabra.contains("vacaciones")) {
				throw new Exception("tenemos un problema");
			}
		}catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("se acabaron las clases");
		}finally {
			sc.close();
			System.out.println("paso por finally");
		}
		
	}

}
