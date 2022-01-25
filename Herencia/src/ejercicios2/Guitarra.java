package ejercicios2;

public class Guitarra extends Instrumento {

	public String cancion;
	Guitarra(String cancion){
		this.cancion=cancion;
	}
	
	
	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	

	@Override
	public void tocar() {
		System.out.println("Tocar la guitarra "+ cancion);
	}
	
	
	
}
