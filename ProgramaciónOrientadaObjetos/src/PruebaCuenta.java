import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		
		Cuenta c1=new Cuenta("Nain",150);
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		while (opcion!=4) {
			System.out.println("¿Qué quieres realizar? Ver saldo(1) Ingresar(2) Retirar(3) Salir(4)");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println(c1.getCantidad());
				break;
			case 2:
				System.out.println("Cantidad a ingresar");
				double i=sc.nextDouble();
				System.out.println(c1.ingresar(i));
				break;
			case 3:
				System.out.println("Cantidad a retirar");
				double r=sc.nextDouble();
				System.out.println(c1.retirar(r));
				break;
			case 4:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		}
	}

}
