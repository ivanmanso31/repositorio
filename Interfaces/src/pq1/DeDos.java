package pq1;

public class DeDos implements Series{

	int start;
	int val;
	
    DeDos() {
        start = 0;
        val = 0;
    }
    public int getNext() {
        val += 1;
        return val;
    }
    public void reset() {
    	  start = 0;
          val = 0;
    }
    public void setStart(int x) {
        start = x;
        val = start;
    }
}
