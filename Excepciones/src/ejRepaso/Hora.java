package ejRepaso;

public class Hora {

	private int hora;
	private int minu;
	private int seg;
	/*
	public Hora(int hora,int minu, int seg) {
		int num;
		if(seg<0 || seg>59 ) {
			if(seg>59) {
				num=seg/60;
				seg=seg-(60*num);
				minu+=num;
			}
			else {
				seg=0;
			}
			
		}
		else if(minu<0 || minu>59 ) {
			if(minu>59) {
				num=minu/60;
				minu=minu-(60*num);
				hora+=num;
			}
			else {
				minu=0;
			}
		}
		else if(hora<0 || hora>23 ) {
			if(hora>23) {
				num=hora/24;
				hora=hora-(24*num);
			}
			else {
				hora=0;
			}
		}
		this.hora=hora;
		this.minu=minu;
		this.seg=seg;
	}
*/
	public Hora() {
		this.hora=0;
		this.minu=0;
		this.seg=0;
	}

	public Hora(int horas, int minutos, int segundos) {
		this.hora=Math.abs(horas);
		this.minu=Math.abs(minutos);
		this.seg=Math.abs(segundos);
		compensacion();
		
		
	}
	public void compensacion() {
		if(this.seg>59) {
			this.minu+=this.seg/60;
			this.seg=this.seg%60;
		}
		if(this.minu>59) {
			this.hora+=this.minu/60;
			this.minu=this.minu%60;
		}
		if(this.hora>23) {
			this.hora=this.hora%24;
		}
	}

	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora<0) {
			this.hora=0;
		}
		else {
			this.hora=hora;
			compensacion();
		}
	}

	public int getMinu() {
		return minu;
	}

	public void setMinu(int minu) {
		if(minu<0) {
			this.minu=0;
		}
		else {
			this.minu=minu;
			compensacion();
		}
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		if(seg<0) {
			this.seg=0;
		}
		else {
			this.seg=seg;
			compensacion();
		}
	}

	public boolean ajustar() {
		if(this.hora>11) {
			return false;
		}
		else {
			return true;
		}
	}
	@Override
	public String toString() {
		return "Hora [horas=" + hora + ", minutos=" + minu + ", segundos=" + seg + "]";
	}
	
	
}
