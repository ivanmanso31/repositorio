import java.io.IOException;
import java.util.Scanner;

public class PruebaCuentaBancaria {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		CuentaBancaria c1=new CuentaBancaria("pepe");
		FicherosOb fichero=new FicherosOb("src\\cuentas\\cuentas.dat");
		try {
			fichero.escribir(c1);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		double cantidad;
		int op=1;
		do {
			System.out.println("1.retirar 2.Ingresar 3.consultar 4.salir");
			op=sc.nextInt();
			switch(op) {
			case 1:{
				System.out.println("cantidad a retirar");
				cantidad=sc.nextDouble();
				c1.retirar(cantidad);
				break;
			}
			case 2:{
				System.out.println("cantidad a ingresar");
				cantidad=sc.nextDouble();
				c1.ingresar(cantidad);
				break;
			}
			case 3:{
				c1.consultar();
				break;
			}
			case 4:{
				System.out.println("Adios");
				break;
			}
			default:{
				System.out.println("seleccion incorrecta");
				break;
			}
			}
		} while (op!=4);
		try {
			fichero.leer();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		CuentaBancaria c2=new CuentaBancaria("pepa",500.0);
		try {
			fichero.escribir(c2);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
