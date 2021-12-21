
public class EjercicioFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximo=10;
		int minimo=0;
		int aux=0;
		int contador=1;
		for(int i=0;i<40;i++) {
			int num=(int)(Math.random()*(maximo-minimo+1)+(minimo));
			System.out.print(num+", ");
			if(num>aux) {
				aux=num;
				contador=1;
			}
			else if (num==aux) {
				contador++;
			}
	}
		System.out.println();
		System.out.println("El mayor número es: "+aux+" y se repite: "+contador+" veces");
		System.out.println("FIN");
}
}