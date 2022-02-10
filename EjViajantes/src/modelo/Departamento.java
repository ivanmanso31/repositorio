package modelo;

import java.util.ArrayList;

public class Departamento {

	private ArrayList<Viajante> dept;
	
	public Departamento() {
		dept=new ArrayList<Viajante>();
	}

	public ArrayList<Viajante> getDept() {
		return dept;
	}

	public void setDept(ArrayList<Viajante> dept) {
		this.dept = dept;
	}
	
	public String a�adirViajante(String v) {
		Viajante aux=new Viajante(v);
		String salida="A�adido con �xito";
		if (dept.contains(aux)) {
			salida="Ya existe";
			return salida;
			}
		else {
			dept.add(aux);
			return salida;
		}
		
	}
	
	public String a�adirCiudad(String ciudad,String nombre) {
		String salida="No existe ese viajante";
		for (int i = 0; i < dept.size(); i++) {
			if (dept.get(i).getNombre().equals(nombre)) {
				dept.get(i).a�adirCiudad(ciudad);
				 salida="A�adido con �xito";
				return salida;
			}
		}
		return salida;
		
	}
	public void mejorViajante() {
		int max=0;
		for (int i = 0; i < dept.size(); i++) {
			if(dept.get(i).getNivel()>=max) {
				max=dept.get(i).getNivel();
			}
		}
		System.out.println("Mejores viajantes: ");
		for (int i = 0; i < dept.size(); i++) {
			if(dept.get(i).getNivel()==max) {
				System.out.println("Mejores viajantes: "+dept.get(i));
			}
		}
		
	}

	
	@Override
	public String toString() {
		return "Departamento [dept=" + dept + "]";
	}
	
	
}
