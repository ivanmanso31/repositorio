
public class metodos {
	public static int Suma (int n1, int n2) {
		return n1+n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		for(int i=1; i<11;i++) {
			num=(int)(Math.random()*100);
			System.out.println(num);
			System.out.println("La suma de "+i+" + "+num+" es "+Suma(i,num));
		}
	}

}
