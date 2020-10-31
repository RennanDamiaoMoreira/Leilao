package estoque;

import logicas.Endereco;

public class Imovel {
	private boolean arrematado;
	private float valorAvaliacao;
	private float incrementoMinimo;
	private Endereco endereco;

	public Imovel(String rua, String bairro, int numero, String cep, String cidade, String uf, float valor,
			float minimo) {
		endereco = new Endereco(rua, bairro, numero, cep, cidade, uf);
		this.valorAvaliacao = valor;
		this.incrementoMinimo = minimo;
		this.arrematado=false;

	}
	public Imovel (Imovel imovel) {
		this.arrematado=imovel.arrematado;
		this.valorAvaliacao=imovel.valorAvaliacao;
		this.incrementoMinimo=imovel.incrementoMinimo;
		this.endereco=imovel.endereco;
	}

	public float getValorAvaliacao() {
		return valorAvaliacao;
	}

	public void setValorAvaliacao(float valorAvaliacao) {
		this.valorAvaliacao = valorAvaliacao;
	}

	public float getIncrementoMinimo() {
		return incrementoMinimo;
	}

	public void setIncrementoMinimo(float incrementoMinimo) {
		this.incrementoMinimo = incrementoMinimo;
	}

	public String descricao() {
		String saida;
		saida = "Imovel localizado " + this.getEndereco().getEndereco() + "\nAvaliado em : R$  " + this.valorAvaliacao;
		return saida;
	}

	public Endereco getEndereco() {
		return endereco;
	}
}
