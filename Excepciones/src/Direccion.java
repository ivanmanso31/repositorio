
public class Direccion {

	private String calle;
	private int num;
	private String ciudad;
	private String pais;
	
	
	public Direccion(String calle, int num, String ciudad, String pais) {
		this.calle = calle;
		this.num = num;
		this.ciudad = ciudad;
		this.pais = pais;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", num=" + num + ", ciudad=" + ciudad + ", pais=" + pais + "]";
	}
	
	
	
}
