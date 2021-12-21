import java.util.Iterator;

public class pruebaStrings {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		String[] cads= {new String("Java para \"principiantes\""),
		new String("estudio de Java Poo"),
		new String("estudio de Poo")};
		for(int i=0;i<cads.length;i++) {
			int pos=cads[i].indexOf("Java");
			if(pos>-1) {
				System.out.println(cads[i]+" "+pos);
			}
		}
		String s=new String("nieve");
		s=s.toUpperCase();
		System.out.println(s);
		if(cads[1].contains("Poo")) {
			System.out.println("libro es de Poo");
		}
		for (String cadena:cads) {
			if (cadena.indexOf("Java")>-1) {
				System.out.println(cadena);
			}
		}
		String subcad=cads[0].substring(0,4);
		System.out.println(subcad);
		subcad=cads[0].substring(4,4);
		if(subcad.isEmpty()) {
			System.out.println("cadena vacía");
		}
	}
}
