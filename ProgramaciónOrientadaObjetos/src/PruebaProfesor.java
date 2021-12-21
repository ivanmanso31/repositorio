
public class PruebaProfesor {

	public static void main(String[] args) {
		Profesor p1=new Profesor("Juan","Antonio",54,true);
		System.out.println(p1.informa());
		Profesor p2=new Profesor();
		System.out.println(p2.informa());
		Profesor p3=new Profesor("Julia","Sanchez",58);
		System.out.println(p3.informa());
	}

}
