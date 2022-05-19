package binarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CrearBinarioProductos {

	public static void main(String[] args) {
		Producto p1=new Producto(1,"impresora hp",10,170.0);
		
		File f=new File("src\\misFicheros\\productos.dat");
		try {
			FileOutputStream fOut=new FileOutputStream(f);
			ObjectOutputStream out=new ObjectOutputStream(fOut);
			out.writeObject(p1);
			out.writeObject(new Producto(2,"raton optico",16,12.5));
			out.writeObject(new Producto(3,"impresora 3d",2,412.5));
			out.writeObject(new Producto(4,"hd 64",12,90.5));
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("todo ha salido bien");
	}
	

}
