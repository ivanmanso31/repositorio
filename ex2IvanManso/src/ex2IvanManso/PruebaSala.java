package ex2IvanManso;

public class PruebaSala {

	public static void main(String[] args) {
		Sala s1=new Sala(2,3); //creamos una sala valida
		Sala s2=new Sala(-1,-1); //creamos una sala no valida para ver sis sale por defecto
		Sala s3=new Sala(4,0); //creamos una sala no valida para ver sis sale por defecto
		Sala s4=new Sala(3,1); //creamos una sala con una columna
		System.out.println(s1); //comprobamos la creacion de la salas
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1.venderEntrada()); //hacemos pruebas vendiendo entradas
		System.out.println(s1.venderEntrada()); 
		System.out.println(s1); //comprobamos
		System.out.println(s1.venderEntrada(2, 1)); //vendemos entradas manualmente
		System.out.println(s1.venderEntrada(1, 2));
		System.out.println(s1.venderEntrada(1, 0));
		System.out.println(s1.venderEntrada(1, 2));
		System.out.println(s1.vendidasFila(0)); //comprobamos las vendidas
		System.out.println(s1.vendidasFila(5)); //comprobamos una fila inexistente
		System.out.println(s1.totalVendidas()); //comprobamos el total
		System.out.println(s1.venderEntrada());
		System.out.println(s1.venderEntrada());
		System.out.println(s1.venderEntrada());
		System.out.println(s1);
	}

}
