package ejRepaso;

public class Reloj {

	private String tipo;
	private Hora hora;
	
	public Reloj(String tipo, Hora hora) {
		tipo.toLowerCase();
		if(tipo=="digital" || tipo=="analogico"){
			this.tipo=tipo;
			this.hora=hora;
		}
		else {
			this.tipo="digital";
			this.hora=hora;
		}
		
	}
	public Reloj(String tipo) {
		tipo.toLowerCase();
		if(tipo!="digital" && tipo!="analogico") {
			this.tipo="digital";
		}
		this.tipo=tipo;
		start();
	}
	
	public void start() {
		hora=new Hora(0,0,0);
	}
	
	public void start(Hora nueva) {
		nueva.compensacion();
		hora=nueva;
	}
	
	public void aumentar(int h,int m,int s) {
		
		this.hora.setSeg(this.hora.getSeg()+s);
		this.hora.setMinu(this.hora.getMinu()+m);
		this.hora.setHora(this.hora.getHora()+h);
		this.hora.compensacion();
		
	}

	public void decrementar(int h, int m, int s) {

		this.hora.setSeg(this.hora.getSeg() - s);
		this.hora.setMinu(this.hora.getMinu() - m);
		this.hora.setHora(this.hora.getHora() - h);
		this.hora.compensacion();

	}
	@Override
	public String toString() {
		
		if(tipo=="digital"){
			return "[ "+hora.getHora()+":"+hora.getMinu()+":"+hora.getSeg()+" ]";
		}
		else {
			if(hora.ajustar()==false) {
				return "<< "+(hora.getHora()-12)+"-"+hora.getMinu()+"-"+hora.getSeg()+" pm >>";
			}
			else {
				return "<< "+hora.getHora()+"-"+hora.getMinu()+"-"+hora.getSeg()+" am >>";
			}
			
		}
	}
}
	
