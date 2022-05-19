import java.io.File;

public class ExChequeadas {

	private String nombre;
	private int nota;
	
	public ExChequeadas(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "ExChequeadas [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	public static int metodo1(int numero) throws ExcsPropias2 {
		if(numero<0) {
			throw new ExcsPropias2("nº demasiado bajo");
		}
		return numero+1;
	}
	
	public String metodo2(String cadena) {
		return cadena + " " + nombre;
	}

	public static int metodo3(int numero) {
		try {
			if (numero < 0) {
				throw new ExcsPropias2("nº demasiado bajo");
			}
		} catch (ExcsPropias2 e) {
			numero=0;
		}
		return numero + 1;
	}
	
}
