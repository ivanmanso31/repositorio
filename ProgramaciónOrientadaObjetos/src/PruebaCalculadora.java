import java.util.Scanner;

public class PruebaCalculadora {

	public static void main(String[] args) {
		Calculadora c=new Calculadora(0,0);
		int num1,num2;
		int opcion;
		do {
			System.out.println("Que quieres realizar? Suma(1) Resta(2) Multiplicación(3) Salir(4)");
			Scanner sc = new Scanner(System.in);
			opcion=sc.nextInt();
			num1=(int)(Math.random()*100);
			num2=(int)(Math.random()*100);
			c.setOp1Op2(num1, num2);
			System.out.println(c.toString());
			switch(opcion) {
			case 1:
				System.out.println(c.suma());
				break;
			case 2:
				System.out.println(c.resta());
				break;
			case 3:
				System.out.println(c.multiplicacion());
				break;
			case 4:
				System.out.println("FIN");
				break;
			default:
				opcion=4;
				break;
			}
			}while(opcion!=4);
	}

}
