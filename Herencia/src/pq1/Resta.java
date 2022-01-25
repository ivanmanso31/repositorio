package pq1;

public class Resta extends Operacion {
	
	public Resta(double valor1, double valor2) {
		super(valor1, valor2);
	}

	@Override
	public double operar() {
		return super.getValor1() - super.getValor2();
	}
}
