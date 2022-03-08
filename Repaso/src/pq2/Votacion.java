package pq2;

import java.util.ArrayList;

public class Votacion {

	private ArrayList <Candidato> votados;
	
	public Votacion() {
		votados=new ArrayList<Candidato>();
	}
	
	public void añadirVoto(String nombre) {
		Candidato aux=new Candidato(nombre);
		if (votados.contains(aux)) {
			for (int i = 0; i < votados.size(); i++) {
				if(votados.get(i).getNombre().equals(nombre)) {
					votados.get(i).añadirVoto();
					System.out.println("Voto para "+nombre+" ,votos actuales "+votados.get(i).getVotos());
				}
			}
		}
		//int pos=votados.indexOf(aux);
		//if(pos<0) {
			//votados.add(aux);
		//}else {
			//votados.get(pos).añadirVoto();
		//}
		else {
			votados.add(aux);
			System.out.println("Añadido candidato "+nombre);
		}
	}
	public void acabarVotacion() {
		for (int i = 0; i < votados.size(); i++) {
			for (int j = i+1; j < votados.size(); j++) {
				if(votados.get(i).getVotos()<votados.get(j).getVotos()) {
					Candidato aux=votados.get(i);
					votados.set(i, votados.get(j));
					votados.set(j, aux);
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Votacion [votados=" + votados + "]";
	}
}
