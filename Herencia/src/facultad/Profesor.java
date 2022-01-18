package facultad;

public class Profesor extends Empleado {

	private String dp;
	

	public Profesor(String id, String nombre, String apellidos, int anyo, String dp) {
		super(id, nombre, apellidos, anyo);
		this.dp=dp;
	}


	public String getDp() {
		return dp;
	}


	public void setDp(String dp) {
		this.dp = dp;
	}


	@Override
	public String toString() {
		return " id "+super.getId()+" año "+super.getAnyo()+" Profesor [dp=" + dp + "]";
	}
	
}
