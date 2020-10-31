package teste;

import clientes.Cliente;

public class testeCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Rennan Damiao Moreira", "Rua Jorge Raimundo ", "Santa Candida", "Juiz de fora", "36215-741", "rennan@genteboa.com", "MG", 66);
		System.out.println(c1.descricao());
	}

}
