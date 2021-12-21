
public class PruebaMiString {
	
	
	public static void main(String[] args) {
		System.out.println(MiString.alReves("Hoy es martes"));
		System.out.println(MiString.limpiaCaracteres("Hoy es martes","es"));
		System.out.println(MiString.limpiaCaracteres1("Hoy es martes","aeiou"));
		System.out.println(MiString.quitaTildes("ÁAÉEÍIÓOÚUaáeéiíoóuú"));
		System.out.println(MiString.esPalindromo("dabale arroz a la zorra el abad"));
		System.out.println(MiString.esPalindromo1("dabale arroz a la zorra el abad"));
		System.out.println(MiString.esNumero("-1234"));
	}

}
