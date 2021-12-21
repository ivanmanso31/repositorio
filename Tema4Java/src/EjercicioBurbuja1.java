
public class EjercicioBurbuja1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int aux;
		String aux2;
		String[] nombres={"pepe","ana","juana","eva","antonio"};
		int[] notas={7,8,4,3,6};
		for(int i=0;i<notas.length;i++) {
			for(int j=i+1;j<notas.length;j++) {
				if(notas[i]>notas[j]) {
					aux=notas[i];
					notas[i]=notas[j];
					notas[j]=aux;
					aux2=nombres[i];
					nombres[i]=nombres[j];
					nombres[j]=aux2;
				}
			}
		}
		for(int i=0;i<notas.length;i++) {
			System.out.println(nombres[i]+" : "+notas[i]);
		}
	}

}
