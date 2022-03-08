import java.util.ArrayList;

public class Wem1 {

	private ArrayList <Double> ntEx;//80%
	private ArrayList <Double> ntTr;//20%
	
	public Wem1(ArrayList<Double> ntEx, ArrayList<Double> ntTr) {
		this.ntEx = ntEx;
		this.ntTr = ntTr;
	}
	
	public Wem1() {
		ntEx=new ArrayList<Double>();
		ntTr=new ArrayList<Double>();
	}
	
	public void agregarNotas(double notaEx,double notaTr) {
		ntEx.add(notaEx);
		ntTr.add(notaTr);
	}
	
	public ArrayList<Integer> calcularNota() {
		ArrayList <Integer> notas =new ArrayList<Integer>();
		for (int i = 0; i < ntEx.size(); i++) {
			notas.add(calcularNota(i));
		}
		return notas;
	}
	public int calcularNota(int num) {
		int nota=0;
		double notae=0;
		try {
			notae=ntEx.get(num);
			if(notae>=4.5) {
				nota=(int)(notae*0.8+ntTr.get(num));
			}
			else {
					nota=(int)((int)notae/(int)ntTr.get(num).intValue());
				
			}
		}catch(IndexOutOfBoundsException e2) {
			System.out.println("Este alumno no existe");
		}catch(ArithmeticException e) {
			nota=(int)notae;
		}
		return nota;
	}
}
