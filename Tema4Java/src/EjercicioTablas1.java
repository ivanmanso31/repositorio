import java.util.Scanner;

public class EjercicioTablas1 {
	private static int[][] crearTabla(int filas, int columnas, int min, int max) {
		int[][] newTabla = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				newTabla[i][j] = (int) (Math.random() * (max - min + 1) + (min));
			}
		}
		return newTabla;
	}

	private static void verTabla(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		int[][] tabla1 = crearTabla(5, 4, 0, 100);
		verTabla(tabla1);
		boolean encontrado = false, seguir = true;
		int num, eleccion;
		do {
			System.out.println("¿Qué número quieres buscar?");
			num = sc.nextInt();
			encontrado = false;
			for (int i = 0; i < tabla1.length; i++) {
				for (int j = 0; j < tabla1[i].length; j++) {
					if (tabla1[i][j] == num) {
						encontrado = true;
						System.out.println("Encontrado en la fila " + i + " y en la columna " + j);
						break;
					}
				}
				if (encontrado) {
					break;
				}
			}
			if (!encontrado) {
				System.out.println(num + " no esta en la tabla");
			}
			System.out.println("¿Quieres buscar otro? Sí(1), No(0)");
			eleccion = sc.nextInt();
			if (eleccion == 0) {
				seguir = false;
			}
		} while (seguir);
		sc.close();
		System.out.println("FIN");

	}

}
