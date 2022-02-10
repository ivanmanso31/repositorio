package pq2;

public class CalculadoraBasica implements OpBasica {

	private double op1;
	private double op2;
	
	public CalculadoraBasica(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public CalculadoraBasica(double op1) {
		this.op1 = op1;
		this.op2 = op1;
	}
	public CalculadoraBasica() {
		op1 = 0;
		op2 = 0;
	}

	public double getOp1() {
		return op1;
	}

	public void setOp1(double op1) {
		this.op1 = op1;
	}

	public double getOp2() {
		return op2;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}

	@Override
	public String toString() {
		return "CalculadoraBasica [op1=" + op1 + ", op2=" + op2 + "]";
	}

	@Override
	public double suma() {
		
		return op1 + op2;
	}

	@Override
	public double resta() {
		
		return  op1 - op2;
	}
	
}
