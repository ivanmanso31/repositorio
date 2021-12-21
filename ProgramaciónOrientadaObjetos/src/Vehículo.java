
public class Vehículo implements InterfazVehicular {

private int ruedas;
private double velMax,peso;
	
@Override
public int getRuedas() {
	return ruedas;
}
@Override
public double getVelMax() {
	return velMax;
}
@Override
public double getPeso() {
	return peso;
}
@Override
public void setRuedas(int nuevo) {
	ruedas=nuevo;
}
@Override
public void setVelMax(double nuevo) {
	velMax=nuevo;
}
@Override
public void setPeso(double nuevo) {
	peso=nuevo;
}
public Vehículo() {
	
}
public Vehículo(int numruedas, double vel, double pes) {
	ruedas=numruedas;
	velMax=vel;
	peso=pes;
}
@Override
public boolean esIgual(Vehículo v1) {
	 if ((v1.ruedas == ruedas) & (v1.velMax == velMax) & (v1.peso == peso)) {
         return true;
     } else {
         return false;
     }
}
@Override
public void copia(Vehículo v1) {
	ruedas=v1.ruedas;
	velMax=v1.velMax;
	peso=v1.peso;
}
}