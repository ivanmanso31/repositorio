
public class pruebaForEach {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		String[][] des= {{"sevilla","barna","burgos"},
						{"paris","burdeos","nantes"},
						{"berlin","tokio"}};
		
		System.out.println("for each");
		for(String[] c:des) {
			for(String ciu:c) {
				System.out.println(ciu);
			}
			System.out.println();
		}
	}

}
