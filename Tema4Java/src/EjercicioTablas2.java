
public class EjercicioTablas2 {

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
		int filas = 5;
		int columnas = 7;
		int num = filas * columnas;
		int[][] tabla1 = new int[filas][columnas];
		for (int i = 0; i < columnas; i++) {
			for (int j = 0; j < filas; j++) {
				tabla1[j][i] = num;
				num--;
			}
		}
		num = filas * columnas;
		int aux = num;
		int[][] tabla2 = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tabla2[i][j] = num;
				num -= filas;
			}
			aux--;
			num = aux;
		}
		verTabla(tabla1);
		System.out.println();
		verTabla(tabla2);
	}

}
