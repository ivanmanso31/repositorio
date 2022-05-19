package clases;

import java.io.IOException;
import java.util.ArrayList;

public class PruebaLectura {

	public static void main(String[] args) {
		FicheroObjProducto mifi = new FicheroObjProducto("src\\Ficheros\\prod.dat");
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
