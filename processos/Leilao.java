package processos;

import java.time.LocalTime;


import estoque.Lote;


public class Leilao {
	private Pregao pregao;
	static LocalTime tempo;

	public Leilao(Pregao pregao) {
		this.pregao = pregao;
	}

	public void abrirPregao() {
		this.pregao.setSituacao(true);
	}

	public void escolherLote() throws Exception {
		for (Lote referencia : pregao.getLote()) {
			if (!(referencia.getArremate())) {
				receberLance(referencia);
			}
		}
	}

	public void receberLance(Lote lote) throws Exception {
		Lance recebido = new Lance(lote, null, 0);
		pregao.inserirLance(recebido);
	}

}
