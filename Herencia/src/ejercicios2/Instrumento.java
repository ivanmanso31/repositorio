package ejercicios2;

public abstract class Instrumento {

	public String tipo;
	
	public abstract void tocar();
	
	public boolean equals(Object obj) {
		Instrumento ins=(Instrumento)obj;
		if(tipo.equals(ins.tipo)) {
			return true;
		}
		return false;
	}
}