package ejercicios2;

public class PruebaAves {

	public static void main(String[] args) {
		
		AveVoladora[] av1= new AveVoladora[100];
		
		av1[0]=new AveVoladora("Halcón Mexicano", "Falco mexicanus", 85, "rapaz");
		av1[1]=new AveVoladora("Águila Pescadora", "Pandion haliaetus", 105, "rapaz");
		av1[2]=new AveVoladora("Tucán","Ramphastos toco", 60, "trepadora");
		av1[3]=new AveVoladora("Pavo Real", "Pavo cristatus", 92, "gallinácea");
		av1[4]=new AveVoladora("Garza", "Mesophoyx intermedia", 98, "zancuda");
		av1[5]=new AveVoladora("Flamenco","Phoenicopterus", 56, "zancuda");

		for (int i = 0; av1[i]!=null && i < av1.length; i++) {
			if(av1[i].peligroExtinción()) {
				av1[i].incrementarNumeroIndividuos(10);
			}
		}
		for (int i = 0; av1[i]!=null && i < av1.length; i++) {
			if(!av1[i].peligroExtinción()) {
				System.out.println(av1[i].toString());
			}

		}
		
		
	}

}
