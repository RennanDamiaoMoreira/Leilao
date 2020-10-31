package processos;

import java.util.ArrayList;
import clientes.Cliente;
import estoque.Lote;
import estoque.LoteAutomovel;
import estoque.LoteImovel;

public class Lance {
	private static ArrayList<String> registros = new ArrayList<String>();
	private String idLance;
	private Lote lote;
	private Cliente cliente;
	private float valor;

	public Lance(Lote lote, Cliente cliente, float valor) {
		if (valor >= lote.getValorAtual()) {
			this.lote = lote;
			this.cliente = cliente;
			this.valor = valor;
			lote.setValorAtual(valor+lote.getIncrementoMinimo());
			int variavel = 1;
			for (String indice : registros) {
				if (indice.equals(lote.getId() + "-" + variavel)) {
					variavel++;
				}
			}
			idLance = lote.getId() + "-" + variavel;
			registros.add(idLance);
		}
	}


	public Lance(Lance lance) {
		this.lote = lance.lote;
		this.cliente = lance.cliente;
		this.valor = lance.valor;
		this.idLance = lance.idLance;
	}

	public static ArrayList<String> getRegistros() {
		return registros;
	}

	public static void setRegistros(ArrayList<String> registros) {
		Lance.registros = registros;
	}

	public String getIdLance() {
		return idLance;
	}

	public void setIdLance(String idLance) {
		this.idLance = idLance;
	}

	public Lote getLote() {
		return this.lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public Cliente getCliente() {
		return new Cliente(this.cliente);
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}