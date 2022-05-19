package diccionarios;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map.Entry;

public class PruebaEvento {

	public static void main(String[] args) {
		HashMap<LocalDateTime,Evento> listaEventos=new HashMap<LocalDateTime,Evento>();
		Evento e1=new Evento("Programame","3 alumnos 1 dam y wem");
		Evento e2=new Evento("homenaje","todos");
		listaEventos.put(e1.getTiempo(), e1);
		listaEventos.put(e2.getTiempo(), e2);
		for (Entry<LocalDateTime,Evento> id :listaEventos.entrySet()) {
			System.out.println(id.getKey()+"->"+id.getValue());
		}
	}

}
