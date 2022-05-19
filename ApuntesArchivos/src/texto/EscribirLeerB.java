package texto;
import java.io.*;
public class EscribirLeerB {

	public static void main(String[] args) throws IOException {
		File f=new File("src\\misFicheros\\f35.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter fb=new BufferedWriter(fw);
		String linea;
		for (int i = 0; i < 11; i++) {
			linea=" linea "+i+" "+(int)(Math.random()*100);
			fb.write(linea);
			fb.newLine();
		}
		fb.close();
		FileReader fr=new FileReader(f);
		BufferedReader fbr=new BufferedReader(fr);
		while((linea=fbr.readLine())!=null) {
			String[] datos=linea.split(" ");
			if (Integer.parseInt(datos[3])%2==0) {
				System.out.println(linea);
			}
			else System.out.println(datos[3]);
			
		}fbr.close();
	}

}
