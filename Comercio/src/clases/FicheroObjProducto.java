package clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class FicheroObjProducto {

	private String ruta;

	public FicheroObjProducto(String ruta) {
		super();
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public void crearFichero(ArrayList<Producto> catalogo) throws IOException {
		File f = new File(this.ruta);
		FileOutputStream fout = new FileOutputStream(f);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		if (catalogo != null) {
			for (int i = 0; i < catalogo.size(); i++) {
				out.writeObject(catalogo.get(i));
			}
		}
		out.close();

	}

	public ArrayList<Producto> devuelveFichero() throws IOException, ClassNotFoundException {
		ArrayList<Producto> ps = new ArrayList<Producto>();
		File f = new File(this.ruta);
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream oin = new ObjectInputStream(fin);
		Producto p;
		try {
			while (true) {
				p = (Producto) oin.readObject();
				ps.add(p);

			}
		} catch (EOFException e) {
			oin.close();
		}
		return ps;
	}

	public static void muestraAl(ArrayList<Producto> cesta) {
		for (int i = 0; i < cesta.size(); i++) {
			System.out.println(cesta.get(i));
		}
	}
	
	@Override
	public String toString() {
		return "FicheroObjProducto [ruta=" + ruta + "]";
	}

}
