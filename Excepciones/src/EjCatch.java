
public class EjCatch {

	public static void main(String[] args) {
		int[] numeros= {2,3,4};
		try {
			System.out.println(numeros[4]);
		}catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("error 2");
			try {
				int v=numeros[1]/0;
			}catch(ArithmeticException e3) {
				System.out.println("division imposible");
			}
		}catch (Exception e1) {
			System.out.println("error 1");
		}
	}

}
