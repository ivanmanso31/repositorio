package ejercicios2;

public class PruebaInstrumentos {

	public static void main(String[] args) {
		Guitarra g=new Guitarra("entre 2 aguas");
		Violin v=new Violin("Re Mayor Op. 35, 1º movimiento – Tchaikovsky");
		Saxofon s=new Saxofon("Born To Run");
		g.tocar();
		v.tocar();
		s.tocar();
		
	}

}
