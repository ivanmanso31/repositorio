package ejercicios1;

public class PruebaEmpleadoH {

	public static void main(String[] args) {
		EmpleadoH[] emps=new EmpleadoH[5];
		emps[0]=new EmpleadoH("Pepe");
		EmpleadoH e1=new EmpleadoH("Eva",54543);
		emps[1]=e1;
		Programador p1=new Programador("jc",222,"java","python");
		emps[2]=p1;
		Programador p2=new Programador("Marcos",221);
		emps[3]=p2;
		emps[4]=new Programador("María",333,"php","prolog","java","c#","fortran","cobol");
		for (EmpleadoH e : emps) {
			System.out.println(e);
		}
		Programador[] misProg=new Programador[4];
		misProg[0]=p1;
		misProg[1]=p2;
		misProg[2]=(Programador)emps[4];
		misProg[3]=new Programador("Antonio",1111,"java");
		System.out.println("Lista de candidatos: ");
		for ( String datos:Programador.mejoresCandidatos("java", misProg)) {
			if(datos!=null) {
				System.out.println(datos);
			}
			
		}
		System.out.println("Lista de candidatos: ");
		for ( String datos:Programador.mejoresCandidatos("cobol", misProg)) {
			if(datos!=null) {
				System.out.println(datos);
			}
		}
	}

}
