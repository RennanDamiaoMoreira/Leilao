package teste;

import clientes.Cliente;
import estoque.Automovel;
import estoque.Imovel;
import estoque.Lote;
import estoque.LoteAutomovel;
import estoque.LoteImovel;
import processos.Lance;

public class testeLance {

	public static void main(String[] args) {
		
		Automovel a1 = new Automovel("golzinho", 2, 7, "vw", 2020, 21450, 2, 2);
		Imovel i1 = new Imovel("januaria", "todos poderes", 22, "22222111", "Cubatao", "SE", 20000, 800);
		
		LoteAutomovel lote1 = new LoteAutomovel("foi comprar cigarro e nao voltou mais", a1);
		LoteImovel lote2 = new LoteImovel("fui pro brejo colher arroz", i1);
		
		Cliente c1 = new Cliente("zeze", "zaza", "zaza", "asd", "1212121", "asemail", "uf", 262);
		
		Lance l1=new Lance(lote1, c1, 2);
		Lance l2=new Lance(lote2, c1, 20000);
		Lance l3=new Lance(lote2, c1, 20800);
		Lance l4=new Lance(lote1, c1, 8);
		Lance l5=new Lance(lote1, c1, 10);
		Lance l6=new Lance(lote2, c1, 21600);
		Lance l7=new Lance(lote2, c1, 20000);// não deve ser registrado
		Lance l8=new Lance(lote1, c1, 16);
		Lance l9=new Lance(lote1, c1, 18);
		Lance l10=new Lance(lote2, c1, 25800);
		
		
		
		System.out.println(Lance.getRegistros());
		
	}

}
