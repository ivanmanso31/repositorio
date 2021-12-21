import java.util.Scanner;

public class PruebaCiudad {

	public static void main(String[] args) {
		int tam=3;
		Ciudad[] ciudades=new Ciudad[tam];
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		while (opcion!=7) {
			System.out.println("¿Qué quieres realizar? Introducir ciudades(1) Registrar temperatura(2) Obtener minima(3) Obtener maxima(4) Ver todas la minimas(5) Ver todas la maximas(6) Salir(7)");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				
				System.out.println("¿Que ciudad quieres introducir?");
				int num=sc.nextInt();
				if(num<0 || num>tam-1 ) {
					System.out.println("Espacio no disponible");
				}
				else if(ciudades[num]!=null) {
					System.out.println("Ese espacio esta ocupado");
				}
				else {
					System.out.println("Nombre de la ciudad");
					String nombre=sc.next();
					System.out.println("Temperatura Máxima");
					int max=sc.nextInt();
					System.out.println("Temperatura Minima");
					int min=sc.nextInt();
					ciudades[num]= new Ciudad(nombre,max,min);
					}
				break;
			case 2:
				System.out.println("Elige ciudad");
			    int num2=sc.nextInt();
			    if(num2<0 || num2>tam-1 ) {
					System.out.println("Espacio no disponible");
				}
			    else if(ciudades[num2]!=null) {
				    System.out.println("Elige mes (0-11)");
				    int mes=sc.nextInt();
					System.out.println("Temperatura a registrar");
					double tem=sc.nextDouble();
					ciudades[num2].registrarTemperatura(mes, tem);
			    }
			    else {
			    	System.out.println("Ciudad no registrada");
			    }
				break;
			case 3:
				System.out.println("Elige ciudad");
			    int num3=sc.nextInt();
			    if(num3<0 || num3>tam-1 ) {
					System.out.println("Espacio no disponible");
				}
			    else if(ciudades[num3]!=null) {
			    	System.out.println(ciudades[num3].minimaGeneral());
			    }
			    else {
			    	System.out.println("Ciudad no registrada");
			    }
				break;
			case 4:
				System.out.println("Elige ciudad");
			    int num4=sc.nextInt();
			    if(num4<0 || num4>tam-1 ) {
					System.out.println("Espacio no disponible");
				}
			    else if(ciudades[num4]!=null) {
			    	System.out.println(ciudades[num4].minimaGeneral());
			    }
			    else {
			    	System.out.println("Ciudad no registrada");
			    }
				break;
			case 5:
				for (int i = 0; i < ciudades.length; i++) {
					if(ciudades[i]!=null) {
						System.out.print(ciudades[i].getNombre()+"\t");
						System.out.println(ciudades[i].getMinimas());
					}
				}
				break;
			case 6:
				for (int i = 0; i < ciudades.length; i++) {
					if(ciudades[i]!=null) {
						System.out.print(ciudades[i].getNombre()+"\t");
						System.out.println(ciudades[i].getMaximas());
					}
				}
				break;
			case 7:
				System.out.println("FIN");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		}
	}
}
