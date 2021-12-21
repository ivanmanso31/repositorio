
public class Vehiculo {
int numPas;
int capacidad;
int consumo;
public Vehiculo(int num, int cap, int con) {
	numPas=num;
	capacidad=cap;
	consumo=con;
}
public Vehiculo() {
}
public Vehiculo(int num, int con) {
	numPas=num;
	consumo=con;
}
public void informacion() {
	System.out.println("tu vehículo puede llevar hasta "+numPas
	+" pasajeros y consume "+consumo+" litros por km");
}
public double coste(double precio, int kmRecorridos) {
	double total=precio*consumo*kmRecorridos;
	return total;
}
}
