package pq1;

public class DepositoBancario implements Cloneable {

	private Persona titular;
	private int dias;
	private double interes;
	private double cantidad;
	
	public DepositoBancario(Persona titular, int dias, double interes, double cantidad) {
		this.titular = titular;
		this.dias = dias;
		this.interes = interes;
		this.cantidad = cantidad;
	}
	
	public DepositoBancario(Persona titular, double interes, double cantidad) {
		this.titular = titular;
		dias = 365;
		this.interes = interes;
		this.cantidad = cantidad;
	}
	public double recibir() {
		return cantidad*(1+interes);
	}
	public String getTitular() {
		return titular.getNombre();
	}
	@Override
	public boolean equals(Object obj) {
		DepositoBancario d=(DepositoBancario)obj;
		if(d.dias==this.dias && d.interes==this.interes) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "DepositoBancario [titular=" + titular + ", dias=" + dias + ", interes=" + interes + ", cantidad="
				+ cantidad + "]";
	}
	@Override
	public DepositoBancario clone() {
		DepositoBancario d = new DepositoBancario(this.titular, this.dias, this.interes, this.cantidad);
	      return d;
	}
}
