import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Numero de preguntas");
		int pregunta=sc.nextInt();
		System.out.println("Numero de aciertos");
		int aciertos=sc.nextInt();
		if (aciertos>pregunta || pregunta<1 || aciertos<0) {
			System.out.println("Error");
		}
		else {
			double porcentaje=(aciertos*100.0/pregunta);
			if (porcentaje<50) {
				System.out.println("Fuera de nivel");
			}
			else if (porcentaje<75) {
				System.out.println("Nivel regular");
			}
			else if (porcentaje<90) {
				System.out.println("Nivel medio");
			}
			else {
				System.out.println("Nivel máximo");
			}
		}
		sc.close();
	}

}
