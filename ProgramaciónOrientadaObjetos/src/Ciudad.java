
public class Ciudad {

	private String nombre;
	private double[] temperaturaMaxima = new double[12];
	private double[] temperaturaMinima = new double[12];
	
	public Ciudad(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad(String nombre,double maxi1,double mini1) {
		this.nombre = nombre;
		for (int i = 0; i < temperaturaMaxima.length; i++) {
			temperaturaMaxima[i]=(Math.random()*(maxi1));
			temperaturaMinima[i]=(Math.random()*(mini1));
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void registrarTemperatura(int mes, double temperatura) {
		if(temperatura>temperaturaMaxima[mes]) {
			temperaturaMaxima[mes]=temperatura;
		}
		else if(temperatura<temperaturaMinima[mes]) {
			temperaturaMinima[mes]=temperatura;
		}
	}
	
	public double maximaGeneral() {
		double max=0;
		for (int i = 0; i < temperaturaMaxima.length; i++) {
			if(temperaturaMaxima[i]>max) {
				max=temperaturaMaxima[i];
			}
		}
		return max;
	}
	
	public double minimaGeneral() {
		double min=20;
		for (int i = 0; i < temperaturaMinima.length; i++) {
			if(temperaturaMinima[i]<min) {
				min=temperaturaMinima[i];
			}
		}
		return min;
	}
	
	public String getMaximas() {
		String tem="";
		for (int i = 0; i < temperaturaMaxima.length; i++) {
			tem+=", mes "+i+" -> "+temperaturaMaxima[i];
		}
		return tem;
	}
	
	public String getMinimas() {
		String tem="";
		for (int i = 0; i < temperaturaMinima.length; i++) {
			tem+=", mes "+i+" -> "+temperaturaMinima[i];
		}
		return tem;
	}
}
