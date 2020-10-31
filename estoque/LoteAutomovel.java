package estoque;

public class LoteAutomovel extends Lote {
	private Automovel carro;

	public LoteAutomovel(String idLote, Automovel carro) {
		super(idLote, carro.getValorInicial(), carro.getIncrementoMinimo());
		this.carro = carro;
	}

	public void setCarro(Automovel carro) {
		this.carro = carro;
	}

	public Automovel getCarro() {
		return new Automovel(this.carro);

	}

	@Override
	public String descricao() {
		return super.descricao() +"\n"+ this.carro.descricao();
	}
}
