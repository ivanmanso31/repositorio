package texto;

import java.util.ArrayList;

public class AlumnoF {

	private String dni;
	private String nombre;
	private ArrayList<Integer> notas;

	public AlumnoF(String dni, String nombre, ArrayList<Integer> notas) {
		this.dni = dni;
		this.nombre = nombre;
		this.notas = notas;
	}
	public AlumnoF(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.notas = new ArrayList<Integer>();
	}

	private boolean esCreciente() {
		boolean es = true;
		int elementos = notas.size();
		int aux;
		int anterior;
		if (elementos > 1) {
			anterior = notas.get(0);
			for (int i = 1; i < elementos; i++) {
				if (anterior > notas.get(i)) {
					es = false;
					break;
				}
				anterior = notas.get(i);
			}
		}
		return es;

	}

	public double notaMedia() {
		double media = 0;
		for (int i = 0; i < notas.size(); i++) {
			media += notas.get(i);
		}
		if (esCreciente()) {
			return Math.ceil(media / notas.size());
		} else {
			return Math.floor(media / notas.size());
		}

	}
	public void agregarNota(int nota) {
		if(nota<11 && nota>-1) {
			notas.add(nota);
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}


	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "AlumnoF [dni=" + dni + ", nombre=" + nombre + ", notas=" + notas + "]";
	}
}
