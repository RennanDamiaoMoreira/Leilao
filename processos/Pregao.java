package processos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import estoque.Lote;
import logicas.LanceAlfabetica;
import logicas.LanceOrdemCrescente;

public class Pregao {
	private ArrayList<Lote> lotes;
	private LocalDate agora;
	private boolean situacao;
	private ArrayList<Lance> cadeiaLances;

	public Pregao() {
		this.lotes = new ArrayList<Lote>();
		agora = agora.now();
		this.situacao = false;
		this.cadeiaLances = new ArrayList<Lance>();

	}

	public boolean getSituacao() {
		return situacao;
	}

	public void inserirLote(Lote lote) {
		this.lotes.add(lote);
	}

	public void inserirLance(Lance lance) throws Exception {
		try {
			if (!(this.getSituacao())) {
				throw new Exception("pregão está fechado");
			} else {
				this.cadeiaLances.add(lance);
			}
		} catch (Exception e) {
			System.out.println("pregão fechado aguarde sua abertura ");

		} finally {

		}
	}

	public void removerLance(Lance lance) {
		this.cadeiaLances.remove(lance);
	}

	public String relatorio() {
		this.situacao = false;
		String texto;

		texto = "Pregao dia :" + this.agora + "\n finalizado\n lances por lote" + lances();
		return texto;

	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public String lances() {
		String texto = new String();
		for (Lote referenciaLote : this.lotes) {
			texto = texto + "\n ----\n" + referenciaLote.descricao() + "\n Lances:";
			for (Lance referenciaLance : this.cadeiaLances) {
				if (referenciaLote == referenciaLance.getLote()) {
					texto = texto + "\n------\n lance:" + referenciaLance.getIdLance() + "\nValor:"
							+ referenciaLance.getValor();
				}
			}
		}

		return texto;
	}

	public String ordemCescente() {
		ArrayList<Lance> ordemCrescente = (ArrayList<Lance>) this.cadeiaLances.clone();
		String texto = new String();
		Collections.sort(ordemCrescente, new LanceOrdemCrescente());
		for (Lance referenciaLance : ordemCrescente) {
			texto = texto + "\n------\n lance:" + referenciaLance.getIdLance() + "\nValor:"
					+ referenciaLance.getValor();
		}
		return texto;

	}

	public String ordemDecrescente() {
		ArrayList<Lance> ordemDecrescente = (ArrayList<Lance>) this.cadeiaLances.clone();
		String texto = new String();
		Collections.sort(ordemDecrescente, new LanceOrdemCrescente());
		Collections.reverse(ordemDecrescente);
		for (Lance referenciaLance : ordemDecrescente) {
			texto = texto + "\n------\n lance:" + referenciaLance.getIdLance() + "\nValor:"
					+ referenciaLance.getValor();
		}
		return texto;

	}

	public String ordemAlfabetica() {

		ArrayList<Lance> ordemAlfabetica = (ArrayList<Lance>) this.cadeiaLances.clone();
		String texto = new String();
		Collections.sort(ordemAlfabetica, new LanceAlfabetica());

		for (Lance referenciaLance : ordemAlfabetica) {
			texto = texto + "\n------\n lance:" + referenciaLance.getIdLance() + "\nValor:" + referenciaLance.getValor()
					+ "\n Cliente :::>" + referenciaLance.getCliente().getNome();
		}
		return texto;

	}

	public ArrayList<Lote> getLote() {
		return this.lotes;
	}

	public void setLotes(ArrayList<Lote> lotes) {
		this.lotes = lotes;
	}

	public ArrayList<Lance> getCadeiaLances() {
		return cadeiaLances;
	}

	public void setCadeiaLances(ArrayList<Lance> cadeiaLances) {
		this.cadeiaLances = cadeiaLances;
	}
}