package pq1;

public class testF2D {
	public static void main(String[] args) {
		forma2D miForma = new forma2D();
		miForma.width=12.5;
		miForma.height=1.3;
		miForma.showDim();
		triangulo t1 = new triangulo();
		t1.height=2.3;
		t1.width=3.4;
		t1.estilo="doble continuo";
		t1.showDim();
		System.out.println(t1.area());
		t1.showStyle();
	}
}
