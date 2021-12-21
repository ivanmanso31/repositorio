
public class MiString {

	public static String alReves(String pal) {
		String aux="";
		for(int i=pal.length();i>0;i--) {
			aux+=pal.charAt(i-1);
		}
		return aux;
	}
	public static String limpiaCaracteres(String pal, String res) {
		String[] salida=pal.split(res);
		String aux="";
		for(int i=0;i<salida.length;i++) {
			aux+=salida[i];
		}
		return aux;
	}
	public static String limpiaCaracteres1(String pal, String res) {
		for(int i=0;i<res.length();i++) {
			String sal="";
			String aux="";
			aux+=res.charAt(i);
			String[] salida=pal.split(aux);
				for(int j=0;j<salida.length;j++) {
					sal+=salida[j];
				}
			pal=sal;
		}
		return pal;
	}
	public static String quitaTildes(String cadena) {
		String tildes="áéíóúÁÉÍÓÚ";
		String noTildes="aeiouAEIOU";
		String salida="";
		int pos;
		for(int i=0;i<cadena.length();i++) {
			pos=tildes.indexOf(cadena.charAt(i));
			if(pos>-1) {
				salida+=noTildes.charAt(pos);
			}
			else {
				salida+=cadena.charAt(i);
			}
		}
		return salida;
	}
	public static boolean esPalindromo(String pal) {
		if(pal.equals(alReves(pal))) {
			return true;
		}
		return false;
	}
	public static boolean esPalindromo1(String pal) {
		String sal="";
		String[] salida=pal.split(" ");
		for(int i=0;i<salida.length;i++) {
			sal+=salida[i];
		}
		for(int i=0;i<(sal.length()/2);i++) {
			if(sal.charAt(sal.length()-(i+1))!=sal.charAt(i)) {
				return false;
			}
			
		}
		return true;
	}
	public static boolean esNumero(String pal) {
		char c;
		int n;
		for (int i = 0; i < pal.length(); i++) {
			c=pal.charAt(i);
			n=(int)c;
			if((n<48 && (n!=45 && n!=46 && n!=43 )) || n>57) {
				return false;
			}
		}
		return true;
	}
}
