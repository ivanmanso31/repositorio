
public class Password {

	private int longitud=8;
	private String clave="";
	public Password( String clave) {
		if(clave.length()==longitud) {
			this.clave = clave;
		}
		else {
			System.out.println("Contraseña incorrecta. Necesita "+longitud+" caracteres.");
		}
	}
	public Password(int longitud, String clave) {
		this.longitud=longitud;
		if(clave.length()==longitud) {
			this.clave = clave;
		}
		else {
			System.out.println("Contraseña incorrecta. Necesita "+longitud+" caracteres.");
		}
	}
	public Password(int longitud) {
		this.longitud=longitud;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		this.clave=generarPassword1();
	}
	public String getClave() {
		return clave;
	}
	public String generarPassword() {
		String numeros="0123456789";
		String especiales="¿?=)(/&%$·!";
		String letras="qwertyuiopasdfghjklñzxcvbnm";
		String cadena="";
		int num=0,esp=0,letr=0;
		for(int i=0;i<5;i++) {
			int random=(int)(Math.random()*numeros.length());
			cadena+=numeros.charAt(random);
		}
		for(int i=0;i<2;i++) {
			int random=(int)(Math.random()*letras.length());
			cadena+=letras.charAt(random);
		}
		cadena=cadena.toUpperCase();
		int random=(int)(Math.random()*letras.length());
		cadena+=letras.substring(random,random+1);
		for(int i=0;i<(longitud-8);i++) {
			random=(int)(Math.random()*especiales.length());
			cadena+=especiales.charAt(random);
		}
		cadena=cadena.substring(0,longitud-1);
		clave=cadena;
		return clave;
	}
	public String generarPassword1() {
		String cadena="";
		int minimo=33;
		int maximo=122;
		for(int i=0;i<longitud;i++) {
			int random=(int)(Math.random()*(maximo-minimo+1)+(minimo));
			cadena+=(char)random;
		}
		clave=cadena;
		return clave;
	}
	
	public String toString() {
		return "Password [longitud=" + longitud + ", clave=" + clave + "]";
	}
}
