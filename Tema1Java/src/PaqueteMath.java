
public class PaqueteMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1=(int) (Math.random()*100+5);
		System.out.println(n1);
		double n2=Math.random()*100+5;
		System.out.println(n2);
		int ne2=(int) (n2);
		System.out.println(ne2);
		int maximo=500;
		int minimo=45;
		int var=(int)(Math.random()*(maximo-minimo+1)+(minimo)); 
		System.out.println(var);
		int abs=Math.abs(-7);
		System.out.println(abs);
	}

}
