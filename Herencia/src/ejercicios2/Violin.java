package ejercicios2;

public class Violin extends Instrumento{

	public String cancion;
	Violin(String cancion){
		this.cancion=cancion;
		this.tipo="violin";
	}
	
	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	@Override
	public void tocar() {
		System.out.println("Tocar el violin "+cancion);
	}
}
