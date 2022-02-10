import java.util.ArrayList;

public class ListaCantantes {

	private ArrayList<Cantante> lista;
	public ListaCantantes() {
		lista = new ArrayList<Cantante>();
		lista.add(new Cantante("xx","xxx"));
		lista.add(new Cantante("yy","yyy"));
		lista.add(new Cantante("zz","zzz"));
	}
}
