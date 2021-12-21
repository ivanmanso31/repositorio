
public class PruebaVehículo {

	public static void main(String[] args) {
		InterfazVehicular v1=new Vehículo(2,120,102.4);
		Vehículo v2=new Vehículo(2,120,102.4);
		Vehículo v3=new Vehículo(4,200,444.4);
		Vehículo v4=new Vehículo(2,120,300);
		InterfazVehicular v5=new Vehículo();
		System.out.println(v1.esIgual(v2));
		System.out.println(v1.esIgual(v4));
		System.out.println(v5.getRuedas());
		v5.copia(v3);
		System.out.println(v5.getRuedas());
		System.out.println(v3.getPeso());
		v3.setPeso(555.5);
		System.out.println(v3.getPeso());
	}

}
