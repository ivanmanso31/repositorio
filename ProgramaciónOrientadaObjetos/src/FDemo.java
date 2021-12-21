
public class FDemo {
	  int x;
	    FDemo(int x) {
	        this.x = x;
	        System.out.println("Creado objeto "+x);
	    }
	    protected void finalize() {
	        System.out.println("Finalizing " + x);
	    }
}
