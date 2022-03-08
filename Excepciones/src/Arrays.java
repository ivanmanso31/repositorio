
public class Arrays {

	public static void main(String args[]) {
		int nums[] = new int[4];
		try {
			System.out.println("Antes de que se genere la excepción");
			// Generando an index out-of-bounds exception.
			nums[2]=-5;
			nums[7] = 10;
			System.out.println("Este mensaje no se emitirá");
		} catch (ArrayIndexOutOfBoundsException exc) {
			// catch the exception
			System.out.println("Index out-of-bounds!");
		}
		System.out.println("Mensaje posterior al cacth");
	}
}
