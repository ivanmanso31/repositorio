import java.util.Arrays;

public class PasswordAlumnos {
	
	private int numalum;
	private Password[] mispass;
	private int tam;
	//private boolean[] fortaleza;
	public PasswordAlumnos(int numalum,int tam) {
		this.numalum=numalum;
		this.tam=tam;
		mispass=new Password[this.numalum];
		//fortaleza=new boolean [];
		rellena();
	}
	private void rellena() {
		for (int i=0;i<numalum;i++) {
			mispass[i]=new Password(tam);
			//fortaleza[i]=mispass[i].esFuerte();
		}
		
	}
	
	public String toString() {
		String claves="";
		for (int i=0;i<numalum;i++) {
			claves+=mispass[i]+"\n";
		}
		return "claves: "+claves;
	}
	
}
