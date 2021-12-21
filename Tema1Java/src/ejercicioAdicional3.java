
public class ejercicioAdicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1=Math.random()*100+1;
		double r1=Math.round(n1*100.0)/100.0;
		System.out.println("primer numero: "+r1);
		double n2=Math.random()*100+1;
		int ne2=(int) (n2);
		double suma=r1+ne2;
		System.out.println(suma);
	}

}
