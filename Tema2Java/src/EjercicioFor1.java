
public class EjercicioFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximo=10;
		int minimo=0;
		boolean b=true;
		int num=(int)(Math.random()*(maximo-minimo+1)+(minimo));
		System.out.println(num);
		for(int i=0;i<9;i++) {
			int num2=(int)(Math.random()*(maximo-minimo+1)+(minimo));
			System.out.println(num2);
			if (num!=num2) {
				System.out.println("Son distintos");
				i=10;
				b=false;
			}
		}
		if(b) {
		System.out.println("Son iguales");
	}
		System.out.println("FIN");
}
}