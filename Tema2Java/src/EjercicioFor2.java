
public class EjercicioFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximo=50;
		int minimo=0;
		int aux=0;
		for(int i=0;i<20;i++) {
			int num=(int)(Math.random()*(maximo-minimo+1)+(minimo));
			System.out.println(num);
			aux=aux+num;
	}
		double resultado=aux/(20.0);
		System.out.println("la media es: "+resultado);
		System.out.println("FIN");
}
}