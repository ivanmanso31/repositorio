
public class EjercicioTablas4 {
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
	
	private static void verLinea(int[][] tabla,int num) {
		System.out.print("La linea "+num+" es: ");
		for(int i=0;i<tabla[num].length;i++) {
			System.out.print(tabla[num][i]+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int num=0;
		int max=0;
		int linea=0;
		int[][] tabla1 = crearTabla(4, 5, 0, 100);
		verTabla(tabla1);
		System.out.println();
		for (int i = 0; i < tabla1.length; i++) {
			num=0;
			for (int j = 0; j < tabla1[i].length; j++) {
				num+=tabla1[i][j];
			}
			System.out.println("La suma de la linea "+i+" es: "+num);
			if (num>max) {
				max=num;
				linea=i;
			}
		}
		System.out.println();
		verLinea(tabla1,linea);
	}

}
