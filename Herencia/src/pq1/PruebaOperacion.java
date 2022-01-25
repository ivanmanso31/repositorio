package pq1;

public class PruebaOperacion {

	public static void main(String[] args) {
		
		Suma s=new Suma(3,4);
		System.out.println(s.operar());
		Resta r=new Resta(3,29);
		System.out.println(r.operar());
		Multiplicacion m=new Multiplicacion(3,29);
		System.out.println(m.operar());
		Division d=new Division(29,3);
		System.out.println(d.operar());
	}

}
