
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] cesta = new double[4];
		boolean[] compro=new boolean[4];
		for (int i=0;i<cesta.length;i++) {
			cesta[i]=Math.round((Math.random()*100)*100)/100.0;
			System.out.print(cesta[i]+"\t ");
		}
		System.out.println();
		for (int i=0;i<compro.length;i++) {
			int cambio=(int)(Math.random()*100+1);
			if (cambio%2!=0) {
				compro[i]=true;
			}
			System.out.print(compro[i]+"\t ");
		}
		System.out.println();
		double total=0;
		for (int i=0;i<cesta.length;i++) {
			if (compro[i]==true) {
				total=total+cesta[i];
			}
		}
		System.out.println(total);
	}

}
