package pq1;

public class MiTele implements Televisor, MisCanales{

	int numCanales;
	int canalActual=1; 
	boolean encendida=false;
	
	public MiTele(int numCanales) {
		
		this.numCanales = numCanales;
		if(this.numCanales>nombreCanal.length-1) {
			this.numCanales=nombreCanal.length-1;
		}
	}

	@Override
	public void encender() {
		if(!encendida) {
			encendida=true;
		}
		
	}

	@Override
	public void apagar() {
		if(encendida) {
			encendida=false;
		}
	}

	@Override
	public void cambiarCanal(int canal) {
		if(encendida=true && canal>0 && canal<=numCanales) {
			canalActual=canal;
			System.out.println("Cambiando a"+nombreCanal[canalActual]);
		}
		else if(encendida=false){
			System.out.println("Televisor apagado");
		}
		else {
			System.out.println("Canal inexistente ");
		}
		
	}

	public int getNumCanales() {
		return numCanales;
	}

	public void setNumCanales(int numCanales) {
		this.numCanales = numCanales;
	}

	public String getCanalActual() {
		return nombreCanal[canalActual];
	}

	public void setCanalActual(int canalActual) {
		this.canalActual = canalActual;
	}

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	@Override
	public String toString() {
		return "MiTele [numCanales=" + numCanales + ", canalActual=" + canalActual + ", encendida=" + encendida + "]";
	}
	
	
	
}
