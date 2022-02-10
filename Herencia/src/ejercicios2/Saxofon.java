package ejercicios2;

public class Saxofon extends Instrumento {

	public String cancion;
	Saxofon(String cancion){
		this.cancion=cancion;
		this.tipo="saxofon";
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocar el saxofon "+ cancion);
	}
}
