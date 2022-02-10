package pq2;

public class Objeto {

	private int dato1;
    private String dato2;
    
	public Objeto(int dato1, String dato2) {

		this.dato1 = dato1;
		this.dato2 = dato2;
	}
	public Objeto() {

		dato1 = 0;
		dato2 = "hola";
	}

	public int getDato1() {
		return dato1;
	}

	public void setDato1(int dato1) {
		this.dato1 = dato1;
	}

	public String getDato2() {
		return dato2;
	}

	public void setDato2(String dato2) {
		this.dato2 = dato2;
	}

	@Override
	public String toString() {
		return "Objeto [dato1=" + dato1 + ", dato2=" + dato2 + "]";
	}

    
}
