package pq1;

public class ProvinciaCostera extends Provincia{

	private int kmCosta;
	public ProvinciaCostera(String nombre, String cc, int km2, int poblacion, int kmCosta) {
		super(nombre, cc, km2, poblacion);
		this.kmCosta=kmCosta;
	}
	public int getKmCosta() {
		return kmCosta;
	}
	public void setKmCosta(int kmCosta) {
		this.kmCosta = kmCosta;
	}
	public void muestra() {
		System.out.println("soy "+getNombre()+" provincia costera con "+kmCosta+" km de costa");
	}
	@Override
	public String toString() {
		return super.toString()+"ProvinciaCostera [kmCosta=" + kmCosta + "]";
	}

	
}
