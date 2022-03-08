package pq1;

public class testAB {

	public static void main(String[] args) {
		DepositoBancario d1 = new DepositoBancario(new Persona("535t", "pepe perez"), 365, 0.05, 1000);
		System.out.println(d1);
		DepositoBancario d2 = new DepositoBancario(new Persona("535j", "mar perez"), 365, 0.55, 2000);
		System.out.println(d2);
		DepositoBancario d3 = d1;
		if (d1.equals(d2)) {
			System.out.println("d1 y d2 tienen direcciones iguales");
		} else {
			System.out.println("d1 y d2 tienen direcciones distintas");
		}
		if (d1.equals(d3)) {
			System.out.println("d1 y d3 apuntan al mismo sitio");
		} else {
			System.out.println("d1 y d3 tienen direcciones distintas");
		}
	}

}
