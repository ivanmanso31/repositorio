
public class Ejercicio1 {
	
	public static void metodo1() {
		String b = null;
		try {
			int[] c = new int[] { 1, 2 };
			System.out.println("Paso F");
			//System.out.println(b.length());
			//System.out.println(c[4]);
			//System.out.println(c[1]/0);
			System.out.println("Paso D");
		} catch (NullPointerException npe) {
			System.out.println("Paso C");
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Paso G");
		} finally {
			System.out.println("Paso E");
		}
		System.out.println("Paso A");
	}

	public static void main(String[] args) {
		try {
			metodo1();
		} catch (Exception e) {
			System.out.println("Paso B");
		}

	}
}