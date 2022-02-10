package pq1;

public class PruebaDeDos {

	public static void main(String[] args) {
		DeDos d=new DeDos();
		d.start=17;
		System.out.println(d.getNext());
		d.setStart(12);
		System.out.println(d.getNext());
		Alumno a1=new Alumno("333",5,5);
		System.out.println(a1);
		a1.setStart(4);
		System.out.println(a1.getNext());

	}

}
