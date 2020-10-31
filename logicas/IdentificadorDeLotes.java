package logicas;

import estoque.Lote;
import estoque.LoteAutomovel;
import estoque.LoteImovel;

public abstract class IdentificadorDeLotes {
	public static int identificaLote(Lote teste) {
		if (teste instanceof LoteAutomovel) {
			return 0 ; 
		}else {
			if (teste instanceof LoteImovel) {
				return 1;
			}
		}
		return -1;
	}

	public static String tipoDeLote(Lote teste) {
		if (teste instanceof LoteImovel) {
			return "este objeto é da classe LoteImovel";
		} else {
			if (teste instanceof LoteAutomovel) {
				return "este objeto é da classe LoteAutomovel";
			}
		}

		return null;
	}
}
