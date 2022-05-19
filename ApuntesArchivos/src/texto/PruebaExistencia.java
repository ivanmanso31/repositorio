package texto;

import java.io.File;
import java.io.IOException;

public class PruebaExistencia {

	public static void main(String[] args) {
		File f=new File ("C:\\Users\\m\\Documents\\programación\\workspaceJ1\\ApuntesArchivos\\src\\misDatos\\v27j.txt");
		if (f.exists()) {
			System.out.println("existe");
		}
		else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("FIN");
	}

}
