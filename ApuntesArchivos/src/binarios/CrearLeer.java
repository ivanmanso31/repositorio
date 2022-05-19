package binarios;
import java.io.*;
public class CrearLeer {

	private static void CrearFB(File f) throws IOException {
		FileOutputStream fOut= new FileOutputStream(f,true);
		int numeroNum= (int)(Math.random()*10+1);
		int[] numeros=new int[numeroNum];
		int num ;
		for (int i = 0; i < numeroNum; i++) {
			num= (int)(Math.random()*20+1);
			numeros[num]++;
			fOut.write(num);
		}
		fOut.close();
	}
	
	private static int verFB(File f) throws IOException {
		FileInputStream fIN=new FileInputStream(f);
		int i;
		int contador=0;
		while((i=fIN.read())!=-1){
			contador++;
			System.out.println(i);
		}
		fIN.close();
		return contador;
	}
	
	public static void main(String[] args) {
		File miF=new File ("src\\misFicheros\\binario1.bin");
		try {
			CrearFB(miF);
			verFB(miF);
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
		}

	}

}
