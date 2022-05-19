package binarios;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class LeerBinarioConcursos {

	public static void main(String[] args) {
		Concurso p1;
		File f = new File("src\\misFicheros\\concursos.dat");
		try {
			FileInputStream fIn = new FileInputStream(f);
			ObjectInputStream in = new ObjectInputStream(fIn);
			while (true) {
				Concurso c = (Concurso) in.readObject();
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			//in.close();
		}
		System.out.println("todo ha salido bien");
		LocalDate hoy = LocalDate.now();
		LocalDate mesPasado = hoy.minusMonths(2);

	}

}
