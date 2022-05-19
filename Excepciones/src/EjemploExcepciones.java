
public class EjemploExcepciones {

	public static int devuelveNumero(int num) {
		try {
			if (num % 2 == 0) {
				throw new Exception("Lanzando excepcion");
			}
			return 1;
		} catch (Exception ex) {
			return 2;
		} finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		System.out.println(devuelveNumero(1));
		System.out.println(devuelveNumero(2));
	}
}
