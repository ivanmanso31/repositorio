package pq1;


public class Test {

	public static void main(String[] args) {
		DemoPrivate dp=new DemoPrivate();
		//dp.mostrar(); no se puede
		System.out.println(dp.xx());
		DemoProtected dpro=new DemoProtected();
		dpro.mostrarP();
	}

}
