package ejercicios2;

public class Nota {
	private int id;
	private String texto;
	
	public Nota(int id, String texto) {
		this.id = id;
		this.texto = texto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	@Override
	public String toString() {
		return "Nota [id=" + id + ", texto=" + texto + "]";
	}
}
