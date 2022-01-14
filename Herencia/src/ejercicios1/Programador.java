package ejercicios1;

import java.util.Arrays;

public class Programador extends EmpleadoH {

	private String lenguajes[];

	public Programador(String nombre, String ...lenguajes ) {
		super(nombre);
		this.lenguajes=lenguajes;
	}
	
	public Programador(String nombre, int telf, String ...lenguajes) {
		super(nombre, telf);
		this.lenguajes = lenguajes;
	}

	public String[] getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String[] lenguajes) {
		this.lenguajes = lenguajes;
	}

	public static String[] mejoresCandidatos(String lenguajePpal,Programador[] ps) {
		String[] lengs;
		String[] salida=new String[ps.length];
		int contador=0;
		for (int i = 0; i <ps.length; i++) {
			lengs=ps[i].lenguajes;
			for (int j = 0; j < lengs.length; j++) {
				if(lengs[j].equals(lenguajePpal)) {
					salida[contador]=ps[i].getNombre()+" . "+ps[i].getTelf();
					contador++;
					break;
				}
			}
		}
		return salida;
	}
	@Override
	public String toString() {
		String salida= super.getNombre()+" con telefono "+super.getTelf()+" conoce los lenguajes\n ";
		for (String l : lenguajes) {
			salida+=l+"  ";
		}
		return salida;
	}
	
}
