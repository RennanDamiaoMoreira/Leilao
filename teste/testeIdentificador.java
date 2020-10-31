package teste;

import clientes.Cliente;

public class testeIdentificador {

	public static void main(String[] args) {
	Cliente c1=new Cliente("ssss", "aaa", "www", "nn", "36251400", "sk", "nn", 232);
	Cliente c2=new Cliente("ssss", "aaa", "www", "nn", "36251400", "sk", "nn", 232);

	Cliente c3=new Cliente("ssss", "aaa", "www", "nn", "36251400", "sk", "nn", 232);
	System.out.println(c1.getId());
	System.out.println(c2.getId());
	System.out.println(c3.getId());

	}

}
