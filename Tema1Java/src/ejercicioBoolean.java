
public class ejercicioBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1=(int) (Math.random()*10+1);
		double n2=(int) (Math.random()*10+1);
		if(n1>n2) {
			System.out.println(n1+" es mayor que "+n2);
		}
		else if(n1==n2) {
			System.out.println(n1+" magicamente es igual a "+n2);
		}
		else {
			System.out.println(n1+" es menor que "+n2);
		}
	}
}

