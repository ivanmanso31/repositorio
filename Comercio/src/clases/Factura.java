package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {

	private LocalDate fecha;
	ArrayList<Producto> misCompras;
	
	public Factura(ArrayList<Producto> misCompras) {
		this.fecha = LocalDate.now();
		this.misCompras = misCompras;
	}
	
	public void emitirFactura() {
		System.out.println(fecha);
		double total=0;
		double detalle=0;
		Producto ps;
		System.out.println("detalle");
		for (int i = 0; i <misCompras.size(); i++) {
			ps=misCompras.get(i);
			detalle=(ps.getUnidades()*ps.getPrecio());
			System.out.println("Producto :"+ps.getDesc()+"\n"+" unidades "+ps.getUnidades()+"\n"+"valor = "+detalle);
			System.out.println();
			total+=detalle;
		}
		
	}
	
}
