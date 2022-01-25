package pq1;

public class PruebaAnimal {

	public static void main(String[] args) {
		
		Animal a=new Animal("mamifero",4);
		System.out.println(a);
		a.comoSuena();
		
		Gato g1=new Gato("mamifero",4);
		System.out.println(g1);
		g1.comoSuena();
		
		Caracal c1=new Caracal("mamifero",4,"sabana");
		System.out.println(c1);
		c1.comoSuena();
		
		Animal refAnimal;
		refAnimal=c1;
		System.out.println("Tengo "+refAnimal.getPatas()+" patas");
		refAnimal.comoSuena();
		refAnimal=g1;
		System.out.println("Tengo "+refAnimal.getPatas()+" patas");
		refAnimal.comoSuena();
	}

}
