
import pq2.ListaObjetos;
import pq2.Objeto;

public class PruebaObjeto {

	public static void main(String[] args) {
		ListaObjetos lo=new ListaObjetos();
		Objeto o1=new Objeto(1,"o1");
		Objeto o2=new Objeto(2,"o2");
		Objeto o3=new Objeto(3,"o3");
		Objeto o4=new Objeto(4,"o4");
		lo.putInicio(o1);
		System.out.println(lo);
		lo.putFinal(o4);
		System.out.println(lo);
		lo.putFinal(o3);
		System.out.println(lo);
		lo.putInicio(o2);
		System.out.println(lo);
		System.out.println(lo.count());
		System.out.println(lo.popFinal());
		System.out.println(lo);
		System.out.println(lo.popPrincipio());
		System.out.println(lo);
		System.out.println(lo.getAt(9));
		System.out.println(lo.getAt(1));
		System.out.println(lo);
	}

}
