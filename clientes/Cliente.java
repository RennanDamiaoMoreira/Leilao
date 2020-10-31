package clientes;

import logicas.Endereco;

public class Cliente {
	private static int identificador = 1;
	private String nome;
	private String email;
	private String id;
	private Endereco endereco;

	public Cliente(String nome, String rua, String bairro, String cidade, String cep, String email, String uf,
			int numeroResidencial) {
		endereco = new Endereco(rua, bairro, numeroResidencial, cep, cidade, uf);
		this.nome = nome;
		this.email = email;
		this.id = "C" + identificador;
		identificador++;

	}

	public Cliente(Cliente cliente) {
		endereco = new Endereco(cliente.endereco.getRua(), cliente.endereco.getBairro(),
				cliente.endereco.getNumeroResidencial(), cliente.endereco.getCep(), cliente.endereco.getCidade(),
				cliente.endereco.getUf());
		this.nome = cliente.nome;
		this.email = cliente.email;
		this.id = cliente.id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String descricao() {
		String saida;
		saida = "Sr(a)" + this.nome + "\n " + this.getEndereco().getEndereco() + "\n email" + this.email;
		return saida;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getId() {
		return id;
	}

}
