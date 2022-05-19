package ejRepaso;

public class AdivinaNumero {

	private int num;
	private int contador;
	
	public AdivinaNumero() {
		this.num=(int)((Math.random()*5)+1);
		this.contador=0;
	}
	public boolean intento(int numero) {
		contador++;
		if(numero!=num) {
			System.out.println("Has fallado");
			comparacion(numero);
			return false;
		}
		else {
			System.out.println("Has acertado");
			return true;
		}
	}
	public void comparacion(int n1) {
		if(n1<num) {
			System.out.println("Estas por debajo");
		}
		else {
			System.out.println("Estas por encima");
		}
	}

	public int getNum() {
		return num;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
}
