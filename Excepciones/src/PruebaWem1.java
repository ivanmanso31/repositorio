
public class PruebaWem1 {

	public static void main(String[] args) {
		
		Wem1 wem1=new Wem1();
		wem1.agregarNotas(7.8, 2.0);
		wem1.agregarNotas(2.3, 1.0);
		wem1.agregarNotas(1.3, 0);
		wem1.calcularNota(4);
		System.out.println(wem1.calcularNota(1));
		for (int notas : wem1.calcularNota()) {
			System.out.println(notas);
		}

	}

}
