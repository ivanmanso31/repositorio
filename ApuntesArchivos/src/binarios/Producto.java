package binarios;

import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable {

	private int codigo;
	private String desc;
	private int unidades;
	private double precio;
	
	public Producto(int codigo, String desc, int unidades, double precio) {
		this.codigo = codigo;
		this.desc = desc;
		this.unidades = unidades;
		this.precio = precio;
	}

	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}
	

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", desc=" + desc + ", unidades=" + unidades + ", precio=" + precio + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo;
	}
}
