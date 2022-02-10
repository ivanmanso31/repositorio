package pq1;

public class Alumno implements Operaciones, Series{

	private String dni;
	private int nota1;
	private int nota2;
	
	public Alumno(String dni, int nota1, int nota2) {
		super();
		this.dni = dni;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}

	@Override
	public int suma(int op1, int op2) {
		if(nota1<nota2) {
			return op1-op2;
		}
		return op2-op1;
	}

	@Override
	public void ver() {
		System.out.println(dni);
		
	}

	@Override
	public int getNext() {
		
		return nota1+nota2+1;
	}

	@Override
	public void reset() {
		nota1=0;
		nota2=0;
	}

	@Override
	public void setStart(int x) {
		nota1+=x;
		
	}
	
}
