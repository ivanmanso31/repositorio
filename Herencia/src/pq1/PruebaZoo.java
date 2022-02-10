package pq1;

public class PruebaZoo {

	public static void main(String[] args) {
		
		Zoo zoo=new Zoo();
		Caracal ca1=new Caracal("mamifero",4,"sabana");
		Gato g=new Gato("mamifero",4);
		Animal pez=new Animal("pez",0);
		Animal rana= new Animal("anfibio",4);
		zoo.agregar(rana);
		zoo.agregar(pez);
		zoo.agregar(g);
		zoo.agregar(ca1);
		zoo.agregar(new Animal("pez",0));
		System.out.println(zoo);
		System.out.println(zoo.IndCategoria("pez"));
	}

}
