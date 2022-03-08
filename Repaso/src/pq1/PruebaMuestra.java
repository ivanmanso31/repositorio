package pq1;

public class PruebaMuestra {

	public static void main(String[] args) {
		Muestra m=new Muestra();
		m.agregar(new Humano("pepega",20));
		m.agregar(new Humano("abelardo",30));
		m.agregar(new Humano("anastasia",21));
		m.agregar(new Humano("jana",22));
		m.agregar(new Humano("luismiguel",20));
		m.ver();
		m.ordenar();
		m.ver();
	}

}
