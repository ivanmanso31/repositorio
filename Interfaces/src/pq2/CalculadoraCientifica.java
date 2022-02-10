package pq2;

public class CalculadoraCientifica extends CalculadoraBasica implements MasOp {

	public CalculadoraCientifica() {
		super();
	}

	public CalculadoraCientifica(double op1, double op2) {
		super(op1, op2);
	}

	public CalculadoraCientifica(double op1) {
		super(op1);
	}

	@Override
	public double suma() {
		double al1=Math.random()*getOp1();
		double al2=Math.random()*getOp2();
		return al1 + al2;
	}

	@Override
	public double multiplica() {
		
		return super.getOp1()*super.getOp2();
	}

	@Override
	public double divide() {
		if(super.getOp2()!=0) {
			return super.getOp1()/super.getOp2();
		}
		System.out.println("Casi explota el universo");
		return 777; 
	}

	@Override
	public void cambioSigno(int pos) {
		if(pos==1) {
			super.setOp1(super.getOp1()*-1);
		}
		else if(pos==2) {
			super.setOp2(super.getOp2()*-1);
		}
		else {
			super.setOp1(super.getOp1()*-1);
			super.setOp2(super.getOp2()*-1);
		}
		
	}

	@Override
	public String toString() {
		return "CalculadoraCientifica [op1=" + super.getOp1() + ", op2=" + super.getOp2() + "]";
	}
	
}
