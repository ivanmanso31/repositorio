
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double galon;
		galon=3.7854118;
		for(int i=1;i<101;i++){
			if(i>1){
		System.out.println(i+" galones son "+ galon*i + " litros");
	}
			else{
				System.out.println(i+ " galon es "+ galon*i +" litros");
			}
			}
}
}