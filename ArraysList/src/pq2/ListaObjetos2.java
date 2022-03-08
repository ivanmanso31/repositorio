package pq2;

public class ListaObjetos2 implements Lista2{

	private Objeto[] l2;
	private int tam;
	private int cuenta;
	public ListaObjetos2(int tam) {
		this.tam=tam;
		l2=new Objeto[tam];
		cuenta=0;
	}
	@Override
	public Object damePrimero() {
		if(cuenta>0) {
			return l2[0];
		}
		return null;
	}
	@Override
	public Object dameFinal() {
		if(cuenta>0) {
			return l2[cuenta-1];
		}
		return null;
	}
	@Override
	public String dameMejor() {
		if(cuenta>0) {
			int max=0;
			String salida="";
			for (int i = 0; i < l2.length; i++) {
				if(l2[i].getDato1()>=max) {
					max=l2[i].getDato1();
					salida+=l2[i].getDato2()+" ";
				}
			}
			return salida;
		}
		return "Error";
	}
	@Override
	public Object dame(int i) {
		if(i<-1 && i<cuenta) {
			return l2[i];
		}
		return null;
	}
	@Override
	public int count() {
		
		return cuenta;
	}
	@Override
	public boolean agregar(Objeto obj) {
		if(cuenta<tam) {
			l2[cuenta]=obj;
			cuenta++;
			return true;
		}
		return false;
	}
	
}
