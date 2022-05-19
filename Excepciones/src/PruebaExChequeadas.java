
public class PruebaExChequeadas {

	public static void main(String[] args) {
		
		try {
			System.out.println(ExChequeadas.metodo1(-10));
		} catch (ExcsPropias2 e) {
			System.out.println(e.getMessage());
			System.out.println("tratada en main");
		}
	}

}
