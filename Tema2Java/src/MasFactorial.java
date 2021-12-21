

public class MasFactorial {
public static int Factorial(int num) {
	int resultado = 1;
	for (int i = 2; i < num + 1; i++) {
		resultado = resultado * i;
	}
	return resultado;
}
	public static void main(String[] args) {
		//Calculo de factorial
		for (int j = 1; j < 11; j++) {
			System.out.println("El factorial de " + j + " es " + Factorial(j));
		}
		System.out.println("FIN");
	}

}
