package pq1;

public class Muestra {

	private Humano[] muestra;
	private int contador;
	private int tam;
	
	public Muestra(int tam) {
		this.tam=tam;
		muestra=new Humano[tam];
	}
	
	public Muestra() {
		this.tam=5;
		muestra=new Humano[tam];
	}
	
	public boolean agregar(Humano h) {
		if(contador<tam) {
			muestra[contador]=h;
			contador++;
			return true;
		}
		return false;
	}
	
	public void ver() {
		for (int i = 0; i < contador; i++) {
			System.out.println(muestra[i]);
		}
	}
	
	public void ordenar() {
		for (int i = 0; i < contador; i++) {
			for (int j = i+1; j < contador; j++) {
				if(muestra[i].compareTo(muestra[j])==-1) {
					Humano aux=muestra[i];
					muestra[i]=muestra[j];
					muestra[j]=aux;
				}
			}
		}
	}
}
