package diccionarios;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Evento {

	private LocalDate fecha;
	private LocalDateTime tiempo;
	private String nombre;
	private String quien;
	
	public Evento(LocalDate fecha, LocalDateTime tiempo, String nombre, String quien) {
		super();
		this.fecha = fecha;
		this.tiempo = tiempo;
		this.nombre = nombre;
		this.quien = quien;
	}

	public Evento(String nombre, String quien) {
		this.nombre = nombre;
		this.quien = quien;
		this.fecha = LocalDate.now();
		this.tiempo = LocalDateTime.now();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDateTime getTiempo() {
		return tiempo;
	}

	public void setTiempo(LocalDateTime tiempo) {
		this.tiempo = tiempo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getQuien() {
		return quien;
	}

	public void setQuien(String quien) {
		this.quien = quien;
	}

	@Override
	public String toString() {
		return "Evento [fecha=" + fecha + ", tiempo=" + tiempo + ", nombre=" + nombre + ", quien=" + quien + "]";
	}
	
}
