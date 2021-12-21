
public class b {

	private int x;
	static private int y;
	
	public b(int x) {
		this.x = x;
		y++;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static int getY() {
		return y;
	}

	public int suma() {
		return x+y;
	}

	public String toString() {
		return "b [x=" + x + "]";
	}
	
}

