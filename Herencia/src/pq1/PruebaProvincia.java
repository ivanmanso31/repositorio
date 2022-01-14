package pq1;

public class PruebaProvincia {

	public static void main(String[] args) {
		Provincia p1=new Provincia("Madrid","Madrid",5456,5589);
		System.out.println(p1);
		System.out.println("la densidad es "+p1.densidad());
		p1.muestra();
		ProvinciaCostera pc1=new ProvinciaCostera("Almeria","Andalucia",5000,1000,200);
		System.out.println(pc1);
		pc1.muestra();
		Provincia[] ps= new Provincia[2];
		ps[0]=p1;
		ps[1]=pc1;
		for (Provincia p : ps) {
			p.muestra();
		}
	}

}
