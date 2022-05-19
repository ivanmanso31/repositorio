package binarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class CrearBinarioConcursos {

	public static void main(String[] args) {
		Concurso p=new Concurso("programame",new String[] {"c1","c2","c3"});
		String[] g= {"g1","g2","g3"};
		Concurso p2=new Concurso("skill-prog",g,LocalDate.now().minusMonths(1));
		File f=new File("src\\misFicheros\\concursos.dat");
		try {
			FileOutputStream fOut=new FileOutputStream(f);
			ObjectOutputStream out=new ObjectOutputStream(fOut);
			out.writeObject(p);
			out.writeObject(p2);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("todo ha salido bien");
	}

}
