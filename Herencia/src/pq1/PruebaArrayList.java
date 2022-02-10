package pq1;

import java.util.ArrayList;

public class PruebaArrayList {

	public static void main(String[] args) {
		
		ArrayList<Animal> misAnimales= new ArrayList<Animal>();
		System.out.println(misAnimales.size());
		misAnimales.add(new Caracal("mamifero",4,"sabana"));
		System.out.println(misAnimales.size());
		Caracal c=(Caracal) misAnimales.get(0);
		System.out.println(c);
		System.out.println(misAnimales.size());
		misAnimales.add(new Gato("mamifero",4));
		misAnimales.add(new Animal("pez",0));
		System.out.println(misAnimales.size());
		for (int i = 0; i <misAnimales.size(); i++) {
			System.out.println(misAnimales.get(i));
		}
		for (Animal a : misAnimales) {
			System.out.println(a);
		}
		if(misAnimales.contains(new Animal("pez",0))) {// tienes que construir el equals en la clase animal
			System.out.println("mi lista contiene un pez");
		}
		else {
			System.out.println("mi lista no contiene un pez");
		}
		int posicion=misAnimales.indexOf(new Animal("pez",0));
		if(posicion!=-1) {
			System.out.println("mi lista contiene un pez");
			System.out.println("esta en la posicion "+posicion);
		}
		else {
			System.out.println("mi lista no contiene un ave");
		}
		misAnimales.add(1, new Animal("anfibio",4));
		for (Animal a : misAnimales) {
			System.out.println(a);
		}
	}

}
