
public class EjercicioFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximo=10;
		int minimo=0;
		int num=(int)(Math.random()*(maximo-minimo+1)+(minimo));
		System.out.println(num);
		int aux=num;
		for(int i=0;i<7;i++) {
			int num2=(int)(Math.random()*(maximo-minimo+1)+(minimo));
			System.out.println(num2);
			aux=aux+num2;
	}
		int num3=(int)(Math.random()*(maximo-minimo+1)+(minimo));
		System.out.println(num3);
		aux=aux+num3;
		if (num==num3) {
			int resultado=aux/10;
			System.out.println("La media es: "+resultado);
		}
		System.out.println("FIN");
}
}