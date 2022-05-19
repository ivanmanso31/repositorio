
public class ExcManual {

	public static void main(String[] args) {
		
		int n=(int)(Math.random()*15);
		try {
		if(n>10) {
			throw new ArithmeticException();
		}
		System.out.println(n);
	 	}catch (ArithmeticException ex) {
	 		System.out.println(ex.toString());
	 		System.out.println("No se acepta una nota "+n+" mayor que 10");
	 	}
		System.out.println("FIN");
	}

}
