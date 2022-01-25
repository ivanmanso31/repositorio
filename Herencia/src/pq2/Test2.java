package pq2;

import pq1.DemoDefault;
import pq1.DemoProtected;

public class Test2 {

	public static void main(String[] args) {
		DemoDefault d= new DemoDefault();
		//d.mostrar(); no se puede
		DemoProtected dpro=new DemoProtected();
		//dpro.mostrarP(); no se puede
	}

}
