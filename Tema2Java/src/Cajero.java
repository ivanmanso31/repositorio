import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximo=10000;
		int minimo=100;
		int saldo=(int)(Math.random()*(maximo-minimo+1)+(minimo));
		Scanner sc=new Scanner(System.in);
		System.out.println("saldo: "+saldo);
		for(int i=1;i<2;i+=0){
		System.out.println("¿Que operación quiere realizar? Sacar dinero(1), Ingresar dinero(2), Ver saldo(3), Salir(4)");
		int seleccion=sc.nextInt();
		switch (seleccion ) {
		case 1:
			System.out.println("¿Cuanto quiere retirar?");
			int retirada=sc.nextInt();
			if (retirada<saldo) {
				saldo=saldo-retirada;
				System.out.println("Operación exitosa, su saldo es: "+saldo);
			}
			else {
				System.out.println("Operación fallida, su saldo es: "+saldo);
			}
			break;
		case 2:
			System.out.println("¿Cuanto quiere ingresar?");
			int ingreso=sc.nextInt();
			saldo=saldo+ingreso;
			System.out.println("Operación exitosa, su saldo actual es: "+saldo);
			break;
		case 3:
			System.out.println("Su saldo es: "+saldo);
			break;
		case 4:
			System.out.println("Adiós, pase un buen dia");
			i=2;
			break;
		default:
			System.out.println("Seleccione una de las opciones correctas");
		}
		}
		sc.close();
	}

}

