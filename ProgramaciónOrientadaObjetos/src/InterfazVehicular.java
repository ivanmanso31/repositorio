
public interface InterfazVehicular {

	int getRuedas();

	double getVelMax();

	double getPeso();

	void setRuedas(int nuevo);

	void setVelMax(double nuevo);

	void setPeso(double nuevo);

	boolean esIgual(Veh�culo v1);

	void copia(Veh�culo v1);

}