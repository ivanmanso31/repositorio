package diccionarios;


import java.util.*;
import java.util.Map.Entry;

public class PruebaMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> listaClase=new HashMap<Integer,String>();
		HashMap<Integer,Producto> listaProducto= new HashMap<Integer, Producto>();
		System.out.println(listaClase.size());
		listaClase.put(4, "raul arco");
		listaClase.put(4, "raul arco");
		listaClase.put(2, "sergio");
		listaClase.put(8, "gonzalo diaz");
		Producto p0= new Producto(1,"raton",3,12.5);
		Producto p1= new Producto(12,"raton",3,12.5);
		Producto p2= new Producto(21,"impresora hp",13,120);
		Producto p3= new Producto(112,"proyector",2,312.5);
		listaProducto.put(p1.getCodigo(), p1);
		listaProducto.put(p2.getCodigo(), p2);
		listaProducto.put(p3.getCodigo(), p3);
		listaProducto.put(p0.getCodigo(), p0);
		System.out.println(listaClase.size());
		for (Entry<Integer,String> id :listaClase.entrySet()) {
			System.out.println(id.getKey()+"->"+id.getValue());
		}
		for (Entry<Integer,Producto> id :listaProducto.entrySet()) {
			System.out.println(id.getKey()+"->"+id.getValue());
		}
		String alumno=listaClase.get(2);
		Producto p =listaProducto.get(12);
		try {
			System.out.println("Alumno buscado "+alumno);
			System.out.println("Producto buscado "+p.getDesc());
		} catch (NullPointerException e) {
			System.out.println("sin extraccion de datos");
		}
		
	}

}
