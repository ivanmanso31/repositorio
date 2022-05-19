package ejRepaso;

public class PruebaReloj {

	public static void main(String[] args) {
		Hora h0=new Hora(12,33,66);
		Hora h1=new Hora(13,45,66);
		Hora h2=new Hora(14,45,66);
		Hora h3=new Hora(15,45,66);
		Hora h4=new Hora(16,45,66);
		Hora h5=new Hora(17,45,66);
		Hora h6=new Hora(18,45,66);
		Hora h7=new Hora(19,45,66);
		Hora h8=new Hora(20,45,66);
		Hora h9=new Hora(21,45,66);
		Hora h10=new Hora(22,45,66);
		Hora h11=new Hora(23,45,66);
		Hora h12=new Hora(24,45,66);
		Hora h13=new Hora(5,78,13);
		
		Reloj r1=new Reloj("nose",h1);
		r1.aumentar(8, 25, 22);
		System.out.println(r1.toString());
		r1.decrementar(8, 25, 22);
		System.out.println(r1.toString());
		Reloj r2=new Reloj("Analogico");
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		r2.start(h1);
		System.out.println(r2.toString());
		r2.start(h2);
		System.out.println(r2.toString());
		r2.start(h3);
		System.out.println(r2.toString());
		r2.start(h4);
		System.out.println(r2.toString());
		r2.start(h5);
		System.out.println(r2.toString());
		r2.start(h6);
		System.out.println(r2.toString());
		r2.start(h7);
		System.out.println(r2.toString());
		r2.start(h8);
		System.out.println(r2.toString());
		r2.start(h9);
		System.out.println(r2.toString());
		r2.start(h10);
		System.out.println(r2.toString());
		r2.start(h11);
		System.out.println(r2.toString());
		r2.start(h12);
		System.out.println(r2.toString());
		r2.start(h0);
		System.out.println(r2.toString());
		
	}

}
