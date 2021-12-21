
public class EjercicioArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros=new int[100];
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=(int)(Math.random()*100+1);
			if(i%2!=0) {
				System.out.println("la posición "+i+" es "+numeros[i]+" ");
			}
		}
	}

}
