import java.io.*;

public class FicherosOb implements Serializable{

	private String ruta;

	public FicherosOb(String ruta) {
		this.ruta = ruta;
	}
	
	public void escribir(CuentaBancaria cb) throws IOException {
		File f=new File(ruta);
		FileOutputStream fout=new FileOutputStream(f);
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(cb);
		out.close();
	}
	
	public void leer() throws IOException, ClassNotFoundException {
		File f=new File(ruta);
		FileInputStream fout=new FileInputStream(f);
		ObjectInputStream out=new ObjectInputStream(fout);
		CuentaBancaria cuenta;
		try {
			while(true) {
				cuenta=(CuentaBancaria)out.readObject();
				System.out.println(cuenta);
			}
		} catch (EOFException e) {
			System.out.println("fin del fichero");
			out.close();
		}
	}
	
}
