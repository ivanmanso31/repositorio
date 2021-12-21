
public class ejercicioAdicional1 {

public static void main(String[] args) {
	double distancia=Math.random()*100+50;
	System.out.println("km recorridos: "+distancia);
	double combustible=Math.random()*10+1;
	System.out.println("litros consumidos: "+combustible);
	double solucion=combustible/distancia;
	System.out.println("El consumo ha sido de: "+solucion+ "l/km");
	System.out.println("redondeado:"+Math.round(solucion*100.0)/100.0);
}
}