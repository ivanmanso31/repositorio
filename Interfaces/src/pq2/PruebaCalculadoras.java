package pq2;

public class PruebaCalculadoras {

	public static void main(String[] args) {
		
		CalculadoraBasica b1=new CalculadoraBasica(7.6);
		CalculadoraBasica b2=new CalculadoraBasica(7.6,4.0);
		CalculadoraBasica b3=new CalculadoraBasica();
		System.out.println(b1.suma()+" "+b1.resta());
		System.out.println(b2.suma()+" "+b2.resta());
		System.out.println(b3.suma()+" "+b3.resta());
		CalculadoraCientifica c1=new CalculadoraCientifica(7.6);
		CalculadoraCientifica c2=new CalculadoraCientifica(7.6,4.0);
		CalculadoraCientifica c3=new CalculadoraCientifica();
		System.out.println(c1.multiplica()+" "+c1.divide());
		System.out.println(c2.multiplica()+" "+c2.divide());
		System.out.println(c3.multiplica()+" "+c3.divide());
		CalculadoraBasica cb=new CalculadoraCientifica(4,5);
		System.out.println(cb.suma());
	}

}
