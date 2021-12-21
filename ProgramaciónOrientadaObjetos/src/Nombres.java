
public class Nombres {
	private int tam;
	private String[] lista;
	private int actual;
	public Nombres(int tamaño) {
		tam=tamaño;
		lista=new String[tam];
		actual=0;
		
	}
	public int añadir(String nombre) {
		if(actual==0) {
			lista[0]=nombre;
			actual++;
			return 0;
		}
		else if(actual<tam) {
			for(int i=0;i<=actual-1;i++) {
				if(lista[i].equals(nombre)) {
					return 1;
				}
			}
			lista[actual]=nombre;
			actual++;
			return 0;
		}
		return -1;
	}
	public boolean eliminar(String nombre) {
		for(int i=0;i<actual;i++) {
			if(lista[i].equals(nombre)) {
				actual--;
				for(int j=i;j<tam-1;j++) {
					lista[j]=lista[j+1];
				}
				lista[tam-1]=null;
				return true;
			}
		}
		return false;
	}
	public void vaciar() {
		for(int i=0;i<actual;i++) {
			lista[i]=null;
		}
		actual=0;
	}
	public String mostrar(int pos) {
		if(pos>actual || pos<0) {
			return "Posición no válida";
		}
		else {
		return "Nombre en la posición "+pos+" es "+lista[pos];
		}
	}
	public int numNombres() {
			return actual;
	}
	public int maxNombres() {
		return tam;
	}
	public boolean estaLlena() {
		if(actual==tam) {
			return true;
		}
		return false;
	}
	public void ver() {
		for(int i=0;i<actual;i++) {
			System.out.println(lista[i]);
		}
	}
}
