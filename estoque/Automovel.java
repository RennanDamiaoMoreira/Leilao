package estoque;

public class Automovel {
	private String modelo;
	private int cavalos;
	private int consumo;
	private String marca;
	private int ano;
	private int quilometragem;

	private float valorInicial;
	private float incrementoMinimo;
	
	
	

	
	
	Automovel (Automovel carro){
		this.modelo =carro.modelo;
		this.cavalos = carro.cavalos;
		this.consumo = carro.consumo;
		this.marca = carro.marca;
		this.ano = carro.ano;
		this.quilometragem = carro.quilometragem;
		
		this.valorInicial = carro.valorInicial;
		this.incrementoMinimo = carro.incrementoMinimo;
	}
	
	
	
	
	public Automovel(String modelo, int cavalos, int consumo, String marca, int ano, int quilometragem,
			 float valorInicial, float incrementoMinimo) {
		
		this.modelo = modelo;
		this.cavalos = cavalos;
		this.consumo = consumo;
		this.marca = marca;
		this.ano = ano;
		this.quilometragem = quilometragem;
	
		this.valorInicial = valorInicial;
		this.incrementoMinimo = incrementoMinimo;
	}
	
	
	public float getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(float valorInicial) {
		this.valorInicial = valorInicial;
	}
	public float getIncrementoMinimo() {
		return incrementoMinimo;
	}
	public void setIncrementoMinimo(float incrementoMinimo) {
		this.incrementoMinimo = incrementoMinimo;
	}
	
	
	public String descricao() {
		String saida;
		saida = "Modelo "+this.modelo+"\nCavalos "+this.cavalos+"\nConsumo "+this.consumo+" Km/l\n Marca "+this.marca+"\nano "+this.ano+"\nRodados "+this.quilometragem+"KM"+"\n Valor Inicial "+this.valorInicial+"\n incremento minimo"+this.incrementoMinimo;
		return saida;
	}
	
	}

