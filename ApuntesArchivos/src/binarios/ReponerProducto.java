package binarios;

import java.io.*;
import java.util.ArrayList;

public class ReponerProducto {

	public static ArrayList<Producto> devuelveProductos() throws IOException, ClassNotFoundException {
		ArrayList<Producto> ps = new ArrayList<Producto>();
		File f = new File("src\\misFicheros\\producto.dat");
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

	public static void main(String[] args) {
		File fb = new File("src\\misFicheros\\producto.dat");
		ObjectInputStream in = null;
		if ((new File("src\\misFicheros\\producto.txt")).exists()) {
			try {
				BufferedReader ficheroEntrada = new BufferedReader(
						new FileReader(new File("src\\misFicheros\\producto.txt")));
				FileOutputStream fOut = new FileOutputStream(fb);
				ObjectOutputStream out = new ObjectOutputStream(fOut);
				String linea = null;
				while ((linea = ficheroEntrada.readLine()) != null) {
					String[] datos = linea.split(" : ");
					if (Integer.parseInt(datos[2]) < 2) {
						out.writeObject(new Producto(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2]),
								Double.parseDouble(datos[3])));
						System.out.println(datos[1] + " registrado");
					}
				}
				ArrayList<Producto> a=devuelveProductos();
				for (int i = 0; i <a.size(); i++) {
					System.out.println(a.get(i));
				}
				out.close();
				ficheroEntrada.close();
			} catch (IOException | ClassNotFoundException errorDeFichero) {
				System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
			}
		} else {
			System.out.println("No he encontrado fichero.txt");
			return;
		}

	}

}
