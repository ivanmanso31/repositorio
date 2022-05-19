import java.util.InputMismatchException;

public class ClausulaF {

	public static void main(String[] args) {
		int n=0;
		try {
			n=CapturarOtroSitio.devuelveNumero();
			int v=10/n;
			CapturarOtroSitioV2.dibujaCuadrado(n);
		}catch(InputMismatchException e) {
			n=4;
		}finally {
			CapturarOtroSitioV2.dibujaCuadrado(n);
		}
		

	}

}
