package teste;

import clientes.Cliente;
import estoque.Automovel;
import estoque.Imovel;
import estoque.LoteAutomovel;
import estoque.LoteImovel;
import processos.Lance;
import processos.Leilao;
import processos.Pregao;

public class testeExcessao {
	public static void main(String[] args) throws Exception  {		
		
		Automovel a1 = new Automovel("golzinho", 2, 7, "vw", 2020, 21450, 2, 2);
		Imovel i1 = new Imovel("januaria", "todos poderes", 22, "22222111", "Cubatao", "SE", 1, 1);
		
		LoteAutomovel lote1 = new LoteAutomovel("foi comprar cigarro e nao voltou mais", a1);
		LoteImovel lote2 = new LoteImovel("fui pro brejo colher arroz", i1);

	Cliente c1 = new Cliente("zeze", "zaza", "zaza", "asd", "1212121", "asemail", "uf", 262);
	Cliente c2 = new Cliente("did", "zaza", "zaza", "asd", "1212121", "asemail", "uf", 262);
	Cliente c3 = new Cliente("nnn", "zaza", "zaza", "asd", "1212121", "asemail", "uf", 262);
	Cliente c4 = new Cliente("adilllton", "zaza", "zaza", "asd", "1212121", "asemail", "uf", 262);
	Cliente c5 = new Cliente("laks", "zaza", "zaza", "asd", "1212121", "asemail", "uf", 262);
	Cliente c6 = new Cliente("efsa", "zaza", "zaza", "asd", "1212121", "asemail", "uf", 262);

	Lance l1=new Lance(lote1, c1, 2);
	Lance l2=new Lance(lote2, c2, 1);//conferir se estava sendo inserido 
	Lance l3=new Lance(lote2, c3, 6);
	Lance l4=new Lance(lote1, c4, 8);
	Lance l5=new Lance(lote1, c5, 10);
	Lance l6=new Lance(lote2, c6, 12);
	Lance l7=new Lance(lote2, c5, 14);
	Lance l8=new Lance(lote1, c4, 16);
	Lance l9=new Lance(lote1, c3, 18);
	Lance l10=new Lance(lote2, c2, 200);
	Lance l11=new Lance(lote1, c1, 20);
	Lance l12=new Lance(lote2, c6, 300);

	Pregao p = new Pregao();
Leilao lei=new Leilao(p);
	p.inserirLote(lote1);
	p.inserirLote(lote2);
	p.inserirLance(l1);
	p.inserirLance(l2);
	p.inserirLance(l3);
	p.inserirLance(l4);
	p.inserirLance(l5);
	p.inserirLance(l6);
	p.inserirLance(l7);
	p.inserirLance(l8);
	p.inserirLance(l9);
	p.inserirLance(l10);
	p.inserirLance(l11);
	p.inserirLance(l12);
	
	
p.setSituacao(true);

p.inserirLance(l4);
p.inserirLance(l5);
p.inserirLance(l6);
p.inserirLance(l7);

lei.escolherLote();

//
//
//	
//	System.out.println("ordem de chegada");
//	System.out.println(p.relatorio());
//	System.out.println("\n\n\n\n\n\n\n---------------ordem crescente");
//	System.out.println(p.ordemCescente());
//	System.out.println("\\n\\n\\n\\n\\n\\n\\n---------------ordem Alfabetica");
//	System.out.println(p.ordemAlfabetica());
//	System.out.println("\n\n\n\n\n\n\n---------------ordem de crescente");
//	System.out.println(p.ordemDecrescente());
//	
	}
	
	
		
	
	
}
