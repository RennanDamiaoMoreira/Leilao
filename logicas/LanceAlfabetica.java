package logicas;

import java.util.Comparator;

import processos.Lance;

public class LanceAlfabetica implements Comparator<Lance> {

	@Override
	public int compare(Lance o1, Lance o2) {
		if (o1.getCliente().getNome().compareTo(o2.getCliente().getNome()) > 0) {
			return 1;
		} else {
			return -1;
		}

	}
}
