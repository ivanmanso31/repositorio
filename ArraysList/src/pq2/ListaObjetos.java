package pq2;

import java.util.ArrayList;

public class ListaObjetos implements Lista{

	private ArrayList<Objeto> l;
	
	public ListaObjetos() {
		
		l = new ArrayList<Objeto>();
	}
	@Override
	public void putInicio(Objeto obj) {
		l.add(0, obj);
	}

	@Override
	public void putFinal(Objeto obj) {
		l.add(obj);
		
	}

	@Override
	public Object popPrincipio() {
		if(l.size()>0) {
			return l.remove(0);
		}
		return null;
	}

	@Override
	public Object popFinal() {
		if(l.size()>0) {
			return l.remove(l.size()-1);
		}
		return null;
	}

	@Override
	public Object getAt(int i) {
		if(i<0 || i>l.size()-1) {
			System.out.println("Posicion no valida");
		}
		else {
			return l.remove(i);
		}
		return null;
	}

	@Override
	public int count() {
		return l.size();
	}
	@Override
	public String toString() {
		return "ListaObjetos [l=" + l + "]";
	}

	
}
