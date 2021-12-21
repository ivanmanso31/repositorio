import java.util.Scanner;

public class PruebaNombres {

	public static void main(String[] args) {
		Nombres l1=new Nombres(3);
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		String nombre;
		while (opcion!=9) {
			System.out.println("�Qu� quieres realizar? A�adir(1) Eliminar(2) Ver(3) Vaciar(4) Mostrar nombre(5) N� de nombres(6) N� m�ximo(7) Llena(8) Salir(9)");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("�Qu� nombre quieres introducir?");
				nombre=sc.next();
				if (l1.a�adir(nombre)==0) {
					System.out.println("Nombre a�adido");
				}
				else if(l1.a�adir(nombre)==1) {
					System.out.println("Nombre repetido");
				}
				else {
					System.out.println("La lista esta llena");
				}
				break;
			case 2:
				System.out.println("�Qu� nombre quieres eliminar?");
				nombre=sc.next();
				if(l1.eliminar(nombre)) {
					System.out.println("Nombre eliminado");
				}
				else {
					System.out.println("El nombre no estaba en la lista");
				}
				break;
			case 3:
				l1.ver();
				break;
			case 4:
				l1.vaciar();
				System.out.println("Lista borrada");
				break;
			case 5:
				int pos;
				System.out.println("�Qu� posici�n quieres ver?");
				pos=sc.nextInt();
				l1.mostrar(pos);
				break;
			case 6:
				System.out.println("Nombres en la lista: "+l1.numNombres());
				break;
			case 7:
				System.out.println("Tama�o de la lista: "+l1.maxNombres());
				break;
			case 8:
				if(l1.estaLlena()) {
					System.out.println("Est� llena");
				}
				else {
					System.out.println("A�n no est� llena");
				}
				break;
			case 9:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Opci�n incorrecta");
				break;
			}
		}
	}

}
