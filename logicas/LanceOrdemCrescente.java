package logicas;
import java.util.Comparator;

import processos.Lance;

public class LanceOrdemCrescente implements Comparator<Lance> {
    @Override
	public int compare (Lance lance1, Lance lance2 ) {
	if (lance1.getValor()>lance2.getValor()) {
		return 1;
	}else {
		return -1;
	}
}
}
