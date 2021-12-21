
public class Cuenta {

	private String titular;
	private double cantidad;
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public Cuenta(String titular) {
		this.titular = titular;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String toString() {
		return "Titular: "+titular+" Saldo actual: "+cantidad;
	}
	public String ingresar(double dinero) {
		if(dinero>0) {
			cantidad+=dinero;
			return "Operaci�n realizada con �xito. Saldo actual: "+cantidad;
		}
		else {
			return "Operaci�n fallida";
		}
	}
	public String retirar(double dinero) {
		if(dinero>0) {
			cantidad-=dinero;
			if(this.cantidad<0) {
				this.cantidad=0;
			}
			return "Operaci�n realizada con �xito. Saldo actual: "+cantidad;
		}
		else {
			return "Operaci�n fallida. Saldo actual: "+cantidad;
		}
	}
}
