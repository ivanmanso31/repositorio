import java.util.ArrayList;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Direccion d1=new Direccion("PedroSalinas",6,"pinto","madrid");
		Direccion d2=new Direccion("desconocida",0,"desconocida","desconocida");
		Persona p1 = new Persona("123435678A","Ana",34,d2);
		Alumno a1 = new Alumno("987654321Z","Pepe",22,d1,"Bachillerato");
		a1.añadirEstudio("CursoIngles");
		
		ArrayList<Persona> pe1=new ArrayList<Persona>();
		pe1.add(a1);
		pe1.add(p1);
		for (int i = 0; i < pe1.size(); i++) {
			pe1.get(i).quienSoy();
			System.out.println(pe1.get(i));
		}
			int contper=0;
			int contalu=0;
			for (Persona p : pe1) {
				contper++;
				if(p instanceof Alumno) {
					contalu++;
				}
				
			}
			System.out.println("Hay "+contper+" personas de las cuales "+contalu+" son alumnos");
	}

}
