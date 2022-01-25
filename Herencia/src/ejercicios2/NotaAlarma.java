package ejercicios2;

public class NotaAlarma extends Nota{

	private int hora;
	
	public NotaAlarma(int id, String texto, int hora) {
		super(id, texto);
		this.hora=hora;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return super.toString()+"NotaAlarma [hora=" + hora + "]";
	}

	
	
	
}
