
public class PruebaVeh�culo {

	public static void main(String[] args) {
		InterfazVehicular v1=new Veh�culo(2,120,102.4);
		Veh�culo v2=new Veh�culo(2,120,102.4);
		Veh�culo v3=new Veh�culo(4,200,444.4);
		Veh�culo v4=new Veh�culo(2,120,300);
		InterfazVehicular v5=new Veh�culo();
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
