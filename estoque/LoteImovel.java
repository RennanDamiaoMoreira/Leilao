package estoque;



public class LoteImovel extends Lote{
	private Imovel imovel;

	public LoteImovel(String idLote, Imovel imovel) {
		super(idLote, imovel.getValorAvaliacao(), imovel.getIncrementoMinimo());
		this.imovel = imovel;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public String descricao() {
		return super.descricao()+"\n"+ this.imovel.descricao();
		
	}
}
