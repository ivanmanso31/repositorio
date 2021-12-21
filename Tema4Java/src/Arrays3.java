
public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] palos= {"oros","copas","bastos","espadas"};
		String[] valores= {"dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey","as"};
		for (int j=0;j<palos.length;j++) {
			for (int i=0;i<valores.length;i++) {
				System.out.println(valores[i]+" de "+palos[j]);
	
			}
		}
		int vr=(int)(Math.random()*valores.length);
		int pr=(int)(Math.random()*palos.length);
		System.out.println("Tu carta es :"+valores[vr]+" de "+palos[pr]);
		int vr2=vr;
		int pr2=pr;
		while (vr2==vr & pr2==pr) {
			vr2=(int)(Math.random()*valores.length);
			pr2=(int)(Math.random()*palos.length);
		}
		System.out.println("El rival saca: "+valores[vr2]+" de "+palos[pr2]);
		if(vr<vr2) {
			System.out.println("Pierdes");
		}
		else if (vr>vr2) {
			System.out.println("Ganas");
		}
		else {
			System.out.println("Empate");
		}
	}

}
