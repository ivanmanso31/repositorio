package ex2IvanManso;

import java.util.Arrays;

public class Sala {

	private boolean[][] butacas;
	private int cols;
	private int filas;

	public Sala(int filas, int columnas) {
		this.filas=filas;
		cols=columnas;
		if(filas>0 && cols>0) { //comprobamos que los datos son mayores que 0
			butacas = new boolean[filas][cols];
		}
		else { //en caso contrario se crea por defecto como 4x4
			butacas=new boolean[4][4];
		}
	}
	public String venderEntrada(int fila,int columna) {
		if((fila<filas && fila>=0) && (columna<cols && columna>=0)) { //comprobamos que los valores estan dentro de la sala
			if(!butacas[fila][columna] ) { //comprobamos que no esta ocupada
				butacas[fila][columna]=true;
				return "operación ok";
			}
			else {
				return "operación no ok";
			}
		}
		else {
			return "operación no ok";
		}
	}
	public String venderEntrada() { 
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				if(!butacas[i][j]) { //comprobamos si la butaca esta ocupada
					butacas[i][j]=true;
					return "("+i+":"+j+")";
				}
			}
		}
		return "(-1:-1)";
	}
	@Override
	public String toString() {
		String salida="Sala" +"\n"+"\n";
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				salida+=butacas[i][j]+" ";
			}
			salida+="\n";
		}
		return salida;	
	}
		
	public int vendidasFila(int fila) {
		int contador=0;
		if(fila<filas && fila>=0) { //comprobamos que la fila existe
			for (int i = 0; i < butacas[fila].length; i++) {
				if(butacas[fila][i]) { //comprobamos si la butaca esta ocupada
					contador++;
				}
			}
		}
		return contador;
	}
	
	public int totalVendidas() {
		int total=0;
		for (int i = 0; i < butacas.length; i++) {
			total+=vendidasFila(i);
		}
		return total;
	}
	
}
