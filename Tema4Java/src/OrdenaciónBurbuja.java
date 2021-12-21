
public class OrdenaciónBurbuja {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int aux;
		int tam=10;
		int[] datos=new int[tam];
		for(int i=0;i<datos.length;i++) {
			datos[i]=(int)(Math.random()*100);
			System.out.print(datos[i]+" ");
		}
		for(int i=0;i<datos.length;i++) {
			for(int j=i+1;j<datos.length;j++) {
				if(datos[i]>datos[j]) {
					aux=datos[i];
					datos[i]=datos[j];
					datos[j]=aux;
				}
			}
		}
		System.out.println();
		for(int i=0;i<datos.length;i++) {
			System.out.print(datos[i]+" ");
		}
		for(int i=0;i<datos.length;i++) {
			for(int j=i+1;j<datos.length;j++) {
				if(datos[i]<datos[j]) {
					aux=datos[i];
					datos[i]=datos[j];
					datos[j]=aux;
				}
			}
		}
		System.out.println();
		for(int i=0;i<datos.length;i++) {
			System.out.print(datos[i]+" ");
		}
	}

}
