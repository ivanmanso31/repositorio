package ejercicios2;

public class Ave {

	 private String nombreVulgar;
	 private String nombreCientifico;
	 int numeroIndividuos;
	 
	public Ave(String nombreVulgar, String nombreCientifico, int numeroIndividuos) {
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.numeroIndividuos = numeroIndividuos;
	}

	public String getNombreVulgar() {
		return nombreVulgar;
	}

	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public int getNumeroIndividuos() {
		return numeroIndividuos;
	}

	public void setNumeroIndividuos(int numeroIndividuos) {
		this.numeroIndividuos = numeroIndividuos;
	}

	void incrementarNumeroIndividuos(int n) {
		 numeroIndividuos+=n;
	 }
	 
	 void decrementarNumeroIndividuos(int n) {
		 if(numeroIndividuos>n) {
			numeroIndividuos-=n;
		 }
		 else {
			 System.out.println("Cantidad no valida");
		 }
	 }
	 boolean peligroExtinción() {
		 if(numeroIndividuos<100) {
			 return true;
		 }
		 return false;
	 }

	@Override
	public String toString() {
		return "Ave [nombreVulgar=" + nombreVulgar + ", nombreCientifico=" + nombreCientifico + ", numeroIndividuos="
				+ numeroIndividuos + "]";
	}
	 
}
