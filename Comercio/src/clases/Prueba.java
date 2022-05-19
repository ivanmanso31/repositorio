package clases;

import java.io.IOException;
import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		FicheroObjProducto mifi = new FicheroObjProducto("src\\Ficheros\\prod.dat");
		ArrayList<Producto> misp = new ArrayList<Producto>();
		misp.add(new Producto(12, "xxx", 23, 23.4));
		misp.add(new Producto(2, "xxy", 2, 2.4));
		misp.add(new Producto(21, "yyy", 3, 234));
		misp.add(new Producto(24, "xyx", 203, 2.34));
		try {
			mifi.crearFichero(misp);
		} catch (IOException e) {
			System.out.println("Problema en el fichero");
		}
		ArrayList<Producto> actual;
		try {
			int u;
			actual = mifi.devuelveFichero();
			for (int i = 0; i < actual.size(); i++) {
				System.out.println(actual.get(i));
				u = actual.get(i).getUnidades();
				actual.get(i).setUnidades(u + 2);
			}
			mifi.crearFichero(actual);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
