import java.io.Serializable;

public class CuentaBancaria implements Serializable{

	private String titular;
	private int numeroCuenta;
	private double saldo;
	private static int numero=100;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		numeroCuenta=numero;
		numero++;
	}
	public CuentaBancaria(String titular,double saldo) {
		this.titular = titular;
		this.saldo=saldo;
		numeroCuenta=numero;
		numero++;
	}
	
	public void ingresar(double cantidad) {
		if(cantidad>0) {
			saldo+=cantidad;
			System.out.println("Operación realizada. Saldo: "+saldo);
		}
		else {
			System.out.println("Ingreso negativo");
		}
	}
	public void retirar(double cantidad) {
		if(cantidad>0) {
			if(cantidad<=saldo) {
				saldo-=cantidad;
				System.out.println("Operación realizada. Saldo: "+saldo);
			}
			else {
				System.out.println("Saldo insuficiente");
			}
		}
		else {
			System.out.println("Retirada negativa");
		}
	}
	public void consultar() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}
	
	
	
	
	
}
