package clases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FicheroObjProducto mifi = new FicheroObjProducto("src\\Ficheros\\prod.dat");
		ArrayList<Producto> actual;
		ArrayList<Producto> tucesta = new ArrayList<Producto>();
		int codigo = 1;
		int unidades;
		int posicion;
		try {
			actual = mifi.devuelveFichero();
			System.out.println("catálogo de la tienda");
			FicheroObjProducto.muestraAl(actual);
			System.out.println();
			do {
				System.out.println("codigo del producto");
				codigo = sc.nextInt();
				posicion = actual.indexOf(new Producto(codigo));
				if (posicion > -1) {
					System.out.println("selecciona unidades");
					unidades = sc.nextInt();
					if (unidades > 0) {
						Producto ps = actual.get(posicion);
						Producto p;
						if (ps.getUnidades() > unidades) {
							p = new Producto(codigo, ps.getDesc(), unidades, ps.getPrecio());
							tucesta.add(p);
							
						} else {
							p = new Producto(codigo, ps.getDesc(), ps.getUnidades(), ps.getPrecio());
							tucesta.add(p);
							System.out.println("Insuficientes unidades añadiendo "+ps.getUnidades());
						}

					}
				} else {
					System.out.println("Producto no existente");
				}

			} while (codigo > 0);
			for (int i = 0; i < tucesta.size(); i++) {
				Producto pcesta = tucesta.get(i);
				int pos = actual.indexOf(pcesta);
				if (pos > -1) {
					actual.get(pos).setUnidades(actual.get(pos).getUnidades() - pcesta.getUnidades());
				}
			}
			mifi.crearFichero(actual);
			Factura fac = new Factura(tucesta);
			fac.emitirFactura();
			System.out.println("Tenga un buen dia");

		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
