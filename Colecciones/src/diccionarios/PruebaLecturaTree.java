package diccionarios;

import java.io.*;
import java.util.TreeMap;
import java.util.Map.Entry;

public class PruebaLecturaTree {
	public static void main(String[] args) {
		File f = new File("src\\diccionarios\\productosM.dat");
		TreeMap<Integer, Producto> mapa;
		try {
			FileInputStream fin = new FileInputStream(f);
			ObjectInputStream in = new ObjectInputStream(fin);
			while (true) {
				mapa = (TreeMap<Integer, Producto>) in.readObject();
				for (Entry<Integer, Producto> id : mapa.entrySet()) {
					System.out.println(id.getKey() + "->" + id.getValue());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
