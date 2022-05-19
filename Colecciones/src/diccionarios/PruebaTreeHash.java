package diccionarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class PruebaTreeHash {

	public static void main(String[] args) {
		Map<Integer,Producto> mapa1=new HashMap<Integer,Producto>();
		Map<Integer,Producto> mapa2=new TreeMap<Integer,Producto>();
		Producto p1=new Producto(12,"impresora hp",7,123.4);
		Producto p2=new Producto(2,"raton hp",27,13.4);
		Producto p3=new Producto(112,"pantalla hp",17,223.4);
		Producto p4=new Producto(111,"pantalla tactil",7,223.4);
		mapa1.put(p1.getCodigo(), p1);
		mapa2.put(p1.getCodigo(), p1);
		mapa1.put(p2.getCodigo(), p2);
		mapa2.put(p2.getCodigo(), p2);
		mapa1.put(p3.getCodigo(), p3);
		mapa2.put(p3.getCodigo(), p3);
		Producto buscado =mapa1.get(p3.getCodigo());
		if(buscado!=null) {
			buscado.setUnidades(1);
		}
		Producto buscado2 =mapa2.get(p4.getCodigo());
		if(buscado2!=null) {
			System.out.println("encontrado");
		}
		else {
			System.out.println("no encontrado");
		}
		for (Entry<Integer,Producto> id :mapa1.entrySet()) {
			System.out.println(id.getKey()+"->"+id.getValue());
		}
		System.out.println("ordenado");
		for (Entry<Integer,Producto> id :mapa2.entrySet()) {
			System.out.println(id.getKey()+"->"+id.getValue());
		}
		mapa2.put(111,p4);
		File f=new File("src\\diccionarios\\productosM.dat");
		try {
			FileOutputStream fout=new FileOutputStream(f);
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(mapa2);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
