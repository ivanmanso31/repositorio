package pq1;

public class Temperatura implements Operaciones{

	private int toma1;
	private int toma2;
	
	public Temperatura(int toma1, int toma2) {
		super();
		this.toma1 = toma1;
		this.toma2 = toma2;
	}

	public int getToma1() {
		return toma1;
	}

	public void setToma1(int toma1) {
		this.toma1 = toma1;
	}

	public int getToma2() {
		return toma2;
	}

	public void setToma2(int toma2) {
		this.toma2 = toma2;
	}

	@Override
	public String toString() {
		return "Temperatura [toma1=" + toma1 + ", toma2=" + toma2 + "]";
	}

	@Override
	public int suma(int op1, int op2) {
		
		return op1+op2+toma1+toma2;
	}

	@Override
	public void ver() {
		toma1+=1;
		toma2+=2;
		
	}
	
}
