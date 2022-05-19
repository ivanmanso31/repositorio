
public class EjemploExcepciones2 {

	private int num;
	
	public EjemploExcepciones2(int num) {
		super();
		this.num = num;
	}
	public int devuelveNumero() {
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
}
