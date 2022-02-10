package pq1;

import java.util.ArrayList;

public class PruebaMiTele {

	public static void main(String[] args) {
		MiTele tv1=new MiTele(13);
		System.out.println(tv1);
		MiTele tv2=new MiTele(10);
		System.out.println(tv2);
		tv1.cambiarCanal(12);
		tv1.encender();
		tv1.cambiarCanal(12);
		tv1.cambiarCanal(2);
		System.out.println(tv1.getCanalActual());
		tv1.apagar();
		tv2.encender();
		tv2.cambiarCanal(12);
		ArrayList<MiTele> misteles=new ArrayList<MiTele>();
		misteles.add(tv2);
		misteles.add(tv1);
		misteles.add(new MiTele(7));
		MiTele tv;
		for (int i = 0; i < misteles.size(); i++) {
			tv=misteles.get(i);
			tv.encender();
			tv.cambiarCanal(2);
			System.out.println(tv);
		}
	}

}
