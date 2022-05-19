package texto;

import java.io.*;

public class Leer8 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src\\misFicheros\\f33.txt");
		BufferedReader bf = new BufferedReader(fr);
		String linea=null;
		while ((linea=bf.readLine())!=null) {
			System.out.println(linea);
		}
		bf.close();
	}

}
