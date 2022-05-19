
public class ExcsPropias extends Exception{

	private int n;
	private int d;
	
	public ExcsPropias(int n,int d) {
		this.n=n;
		this.d=d;
	}

	@Override
	public String toString() {
		return "ExcsPropias [n=" + n + ", d=" + d + "]";
	}
	
}
