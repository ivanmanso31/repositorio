package ejVehiculo;

import java.util.Objects;

public class Vehiculo {

	private String matricula;
	private String marca;
	private String modelo;
	private int velocidad;
	private boolean luces;
	private int marcha;
	
	public Vehiculo(String matricula, String marca, String modelo, int marcha, boolean luces) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.luces = luces;
		this.marcha = marcha;
		setMarcha(marcha);
	}
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = 0;
		this.luces = false;
		this.marcha= 0;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
		ponerMarcha();
	}

	public boolean isLuces() {
		return luces;
	}

	public void setLuces(boolean luces) {
		this.luces = luces;
	}

	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		switch (marcha) {
		case 0: velocidad=0;
			break;
		case 1: velocidad=10;
			break;
		case 2: velocidad=30;
			break;
		case 3: velocidad=60;
			break;
		case 4: velocidad=90;
			break;
		case 5: velocidad=120;
			break;
		default:System.out.println("Marcha no valida");
			marcha=0;
			velocidad=0;
			break;
		}
		this.marcha = marcha;
	}
	
	private void ponerMarcha() {
		if(velocidad<=0) {
			marcha=0;
		}
		else if(velocidad<=10) {
			marcha=1;
		}
		else if(velocidad<=30) {
			marcha=2;
		}
		else if(velocidad<=60) {
			marcha=3;
		}
		else if(velocidad<=90) {
			marcha=4;
		}
		else {
			marcha=5;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		Vehiculo other =(Vehiculo) obj;
		if(other.marca.equals(marca) && other.matricula.equals(matricula) && other.modelo.equals(modelo)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", velocidad="
				+ velocidad + ", luces=" + luces + ", marcha=" + marcha +"]";
	}
	
	
}
