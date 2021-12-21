
public class EjercicioArrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		double[] notas=new double[20];
		double media=0.0;
		int alumnos=0;
		for(int i=0;i<notas.length;i++) {
			notas[i]=Math.random()*10;
			media+=notas[i];
		}
		media=media/(notas.length);
		System.out.println("la media es: "+media);
		for(int i=0;i<notas.length;i++) {
			System.out.println(notas[i]);
			if(notas[i]>media) {
				alumnos+=1;
			}
		}
		System.out.println("Alumnos por encima de la media : "+alumnos);
	}

}
