
public class pruebaForEach {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
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
