package binarios;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OperarProducto {

	private String ruta;

	public OperarProducto(String ruta) {
		this.ruta = ruta;
	}

	public ArrayList<Producto> devuelveProductos() throws IOException, ClassNotFoundException {
		ArrayList<Producto> ps = new ArrayList<Producto>();
		File f = new File(this.ruta);
		ObjectInputStream in = null;
		try {
			FileInputStream fIn = new FileInputStream(f);
			in = new ObjectInputStream(fIn);
			while (true) {
				Producto c = (Producto) in.readObject();
				ps.add(c);
			}
		} catch (EOFException ex) {
			in.close();
		}
		return ps;
	}

	public void creaFProductos(ArrayList<Producto> ps) throws IOException {
		File f = new File(this.ruta);
		FileOutputStream FOut = new FileOutputStream(f);
		ObjectOutputStream out = new ObjectOutputStream(FOut);
		for (Producto p : ps) {
			out.writeObject(p);
		}
		out.close();
	}

}