package logicas;

public class Endereco {
	private String endereco;
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	private int numeroResidencial;

	public Endereco(String rua, String bairro, int numero, String cep, String cidade, String uf) {
		this.endereco = "Rua " + rua + "\nBairro " + bairro + "\nnumero " + numero + "\nCEP " + cep + "\ncidade "
				+ cidade + "\nUF " + uf;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
		this.numeroResidencial = numero;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getCep() {
		return cep;
	}

	public String getUf() {
		return uf;
	}

	public int getNumeroResidencial() {
		return numeroResidencial;
	}

	public String getEndereco() {
		return endereco;
	}

}
