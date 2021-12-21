
public class EjercicioTablas3 {

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
		int lado=5;
		int num=1;
		int aux;
		int[][] tabla1 = new int[lado][lado];
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				tabla1[i][j] = num;
				num++;
			}
		}
		verTabla(tabla1);
		System.out.println();
		for(int i=0;i<lado;i++) {
			for(int j=i+1;j<lado;j++) {
				aux=tabla1[i][j];
				tabla1[i][j]=tabla1[j][i];
				tabla1[j][i]=aux;
			}
		}
		verTabla(tabla1);
	}

}
