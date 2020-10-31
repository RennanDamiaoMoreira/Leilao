package estoque;

import logicas.IdentificadorDeLotes;

public abstract class Lote {
	private String idLote;
	private String id;
	private static int identificador = 1;
	private IdentificadorDeLotes identi;
	private boolean arremate;
	private float valorAtual;
	private float incrementoMinimo;

	
	
	public Lote(String idLote, float valorInicial, float incrementoMinimo) {
		this.idLote = idLote;
		this.id = "L" + identificador;
		identificador++;
		this.arremate = false;
		this.valorAtual = valorInicial;
		this.incrementoMinimo = incrementoMinimo;
	}

	public String descricao() {
		return "lote " + this.getId() + "\n descricao " + this.getIdLote()+"\nSituacao===>"+this.situacao();
	}
	
	public String situacao() {
		if (this.arremate) {
			return "ja arrematado";
		}else {
			return "para arrematar";
		}
	}
	
	
	





	public IdentificadorDeLotes getIdenti() {
		return identi;
	}

	public void setIdenti(IdentificadorDeLotes identi) {
		this.identi = identi;
	}

	
	public boolean getArremate() {
		return arremate;
	}

	public void setArremate(boolean arremate) {
		this.arremate = arremate;
	}

	public float getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(float valorAtual) {
		this.valorAtual = valorAtual;
	}

	public float getIncrementoMinimo() {
		return incrementoMinimo;
	}

	public void setIncrementoMinimo(float incrementoMinimo) {
		this.incrementoMinimo = incrementoMinimo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Lote.identificador = identificador;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public String getIdLote() {
		return idLote;
	}

}
