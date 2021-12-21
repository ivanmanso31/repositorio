
public class menorFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximo=100;
		int minimo=-100;
		int aux=Integer.MAX_VALUE;
		for(int i=1;i<11;i++){
			int num=(int)(Math.random()*(maximo-minimo+1)+(minimo));
			System.out.println("El número "+i+" es: "+num);
		    if (num<aux) {
		    	aux=num;
		    }
		}
		System.out.println("El menor es: "+aux);
	}

}
