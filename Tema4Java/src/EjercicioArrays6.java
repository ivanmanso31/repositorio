
public class EjercicioArrays6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] factoriales=new long[20];
		factoriales[0]=1;
		for(int i=1;i<factoriales.length;i++) {
			factoriales[i]=factoriales[i-1]*(i+1);
		}
		for(int i=0;i<factoriales.length;i++) {
			System.out.println("El factorial de "+(i+1)+" es "+factoriales[i]+" ");
		}
	}

}
