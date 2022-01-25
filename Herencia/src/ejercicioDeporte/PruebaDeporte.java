package ejercicioDeporte;

public class PruebaDeporte {

	public static void main(String[] args) {
		Futbol f1=new Futbol();
		for (int i = 0; i < 10; i++) {
			int r=(int)(Math.random()*4);
			if(r==1 || r==3) {
				
			}
			else if(r==2){
				f1.marcarGol(0);
			}
			else {
				f1.marcarGol(1);
			}
		}
		System.out.println(f1.toString());
	}

}
