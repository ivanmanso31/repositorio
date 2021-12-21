
public class EjercicioArrays5 {
	public static int menor(int[] array) {
		int menor=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<menor) {
				menor=array[i];
			}
		}
		return menor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros=new int[10];
		int aux=0;
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=(int)(Math.random()*10+1);
			System.out.print(numeros[i]+" ");
		}
		aux=numeros[0];
		numeros[0]=numeros[9];
		numeros[9]=aux;
		System.out.println();
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println();
		System.out.println("El menor dato es "+menor(numeros));
	}

}
