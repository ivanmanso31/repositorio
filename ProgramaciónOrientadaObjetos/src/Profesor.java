
public class Profesor {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean especialista;
	public Profesor(String nombre, String apellidos, int edad, boolean especialista) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.especialista = especialista;
	}
	public Profesor() {
		nombre="Gonzalo";
		apellidos="Rubio";
		edad=30;
		especialista=false;
	}
	public Profesor(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		especialista=false;
	}
	public Profesor(String nombre, int edad) {
		this.nombre = nombre;
		apellidos = "Rubio";
		this.edad = edad;
		especialista=true;
	}
	public String informa() {
		return "Nombre del profesor: "+nombre+" Apellidos: "+apellidos+" Edad: "+edad+" Especialista: "+especialista;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isEspecialista() {
		return especialista;
	}
	public void setEspecialista(boolean especialista) {
		this.especialista = especialista;
	}
	
}
