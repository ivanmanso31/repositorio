import java.util.Scanner;

public class EjercicioStrings10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int num=sc.nextInt();
		boolean control=true;
		String cad=String.valueOf(num);
		for(int i=0, j=cad.length()-1;i<j;i++, j--) {
			if(cad.charAt(i)!=cad.charAt(j)) {
				control=false;
				break;
			}
		}
		if(control) {
			System.out.println(num+" es capic�a");
		}
		else {
			System.out.println(num+ " no es capic�a");
		}
		sc.close();
	}

}
