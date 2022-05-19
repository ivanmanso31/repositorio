package texto;

import java.io.File;

public class PruebaFile {

	public static void main(String[] args) {
		
		File f1=new File("src\\misDatos");
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
		System.out.println(f1.getAbsolutePath());
		if (f1.isDirectory()) {
			String[] misFicheros =f1.list();
			
			for (String s : misFicheros) {
				System.out.println(s);
			}
		}
		System.out.println("FIN");
	}
}
