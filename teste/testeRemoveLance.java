package teste;

import clientes.Cliente;
import estoque.Automovel;
import estoque.Lote;
import estoque.LoteAutomovel;
import processos.Lance;
import processos.Pregao;

public class testeRemoveLance {
	public static void main(String[] args) throws Exception {		
		
		Automovel a1 = new Automovel("golzinho", 2, 7, "vw", 2020, 21450, 2, 1);
		Automovel a2 = new Automovel("saveiro", 2, 7, "vw", 2020, 21450, 2, 1);

		LoteAutomovel lote1 = new LoteAutomovel("foi comprar cigarro e nao voltou mais", a1);
		LoteAutomovel lote2 = new LoteAutomovel("fui pro brejo colher arroz", a2);

		Cliente c1 = new Cliente("zeze", "zaza", "zaza", "asd", "1212121", "asemail", "uf", 262);

		Lance l1=new Lance(lote1, c1, 2);
		Lance l2=new Lance(lote2, c1, 1);//conferir se estava sendo inserido 
		Lance l3=new Lance(lote2, c1, 6);
		Lance l4=new Lance(lote1, c1, 8);
		Lance l5=new Lance(lote1, c1, 10);
		Lance l6=new Lance(lote2, c1, 12);
		Lance l7=new Lance(lote2, c1, 14);
		Lance l8=new Lance(lote1, c1, 16);
		Lance l9=new Lance(lote1, c1, 18);
		Lance l10=new Lance(lote2, c1, 200);
		Lance l11=new Lance(lote1, c1, 20);
		Lance l12=new Lance(lote2, c1, 300);

		Pregao p = new Pregao();

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
		
		
		System.out.println(p.relatorio());
		p.removerLance(l4);
		System.out.println(p.relatorio());
		
		
		}
}
