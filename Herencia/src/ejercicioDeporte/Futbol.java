package ejercicioDeporte;

import java.util.Arrays;

public class Futbol extends Deporte{

	private int[] goles;
	
	public Futbol() {
		super("Futbol", 2, 11);
		goles=new int[super.getNumeroDeEquipos()];
	}
	 public void marcarGol(int equipo) {
		 if(equipo==0 || equipo==1) {
		 goles[equipo]++;
		 }
		 else {
			 System.out.println("Equipo no valido");
		 }
	 }
	@Override
	public String toString() {
		return "Futbol [goles=" + Arrays.toString(goles) + "]";
	}
}
