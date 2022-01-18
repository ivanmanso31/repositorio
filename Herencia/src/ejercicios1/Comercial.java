package ejercicios1;

public class Comercial extends EmpleadoH {

	double totalVentas;
	String ciudad;
	String productosVendidos;
	
	public Comercial(String nombre, int telf, String ciudad) {
		super(nombre, telf);
		totalVentas = 0;
		this.ciudad = ciudad;
	}
	
	public Comercial(String nombre) {
		super(nombre);
		totalVentas = 0;
	}

	public String getCiudad() {
		if(ciudad==null) {
			ciudad="Desconocida";
		}
		return ciudad;
	}
	
	public void sumarVenta (double importe) {
		totalVentas+=importe;
	}
	
	public double getTotalVentas() {
		return totalVentas;
	}
	
	public void vendeProducto (String producto) {
		if (productosVendidos==null) {
			productosVendidos=producto;
		}
		else {
			productosVendidos+=", "+producto;
		}
	}
	public String[] getProductosVendidos() {
		return productosVendidos.split(",");
	}

	@Override
	public String toString() {
		return "Nombre"+super.getNombre()+ " [totalVentas=" + totalVentas + ", ciudad=" + ciudad + ", productosVendidos="
				+ productosVendidos + "]";
	}
}
