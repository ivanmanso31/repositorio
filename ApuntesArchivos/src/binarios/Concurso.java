package binarios;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public class Concurso implements Serializable{

	private String nombre;
	private String[] ganadores;
	private LocalDate fecha;
	
	public Concurso(String nombre, String[] ganadores, LocalDate fecha) {
		this.nombre = nombre;
		this.ganadores = ganadores;
		this.fecha = fecha;
	}
	
	public Concurso(String nombre, String[] ganadores) {
		this.nombre = nombre;
		this.ganadores = ganadores;
		this.fecha = LocalDate.now().minusDays(1);
	}

	@Override
	public String toString() {
		return "Concurso [nombre=" + nombre + ", ganadores=" + Arrays.toString(ganadores) + ", fecha=" + fecha + "]";
	}
	
	
}
