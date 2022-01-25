package ejercicioDeporte;

public class Deporte {

	private String nombre;
	private int numeroDeEquipos;
	private int numeroDeJugadoresPorEquipo;
	
	public Deporte(String nombre, int numeroDeEquipos,int numeroDeJugadoresPorEquipo) {
		this.nombre = nombre;
		this.numeroDeEquipos = numeroDeEquipos;
		this.numeroDeJugadoresPorEquipo = numeroDeJugadoresPorEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeEquipos() {
		return numeroDeEquipos;
	}

	public void setNumeroDeEquipos(int numeroDeEquipos) {
		this.numeroDeEquipos = numeroDeEquipos;
	}

	public int getNumeroDeJugadoresPorEquipo() {
		return numeroDeJugadoresPorEquipo;
	}

	public void setNumeroDeJugadoresPorEquipo(int numeroDeJugadoresPorEquipo) {
		this.numeroDeJugadoresPorEquipo = numeroDeJugadoresPorEquipo;
	}
}
