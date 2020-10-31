package teste;

import estoque.Automovel;
import estoque.Imovel;
import estoque.LoteAutomovel;
import estoque.LoteImovel;

public class testeLotes {

	public static void main(String[] args) {
		Automovel a1 = new Automovel("golzinho", 2, 7, "vw", 2020, 21450, 2, 2);
		Imovel i1 = new Imovel("januaria", "todos os poderes", 22, "22222111", "Cubatao", "SE", 20000, 800);
		
		LoteAutomovel lote1 = new LoteAutomovel("foi comprar cigarro e nao voltou mais", a1);
		LoteImovel lote2 = new LoteImovel("fui pro brejo colher arroz", i1);
		System.out.println(lote1.descricao());
		System.out.println(lote2.descricao());

	}

}
