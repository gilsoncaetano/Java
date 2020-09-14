package seguros;

import contas.Conta;

public class PessoaFisica {
	

	public static void main(String[] args) {
		Conta cc3 = new Conta();
		cc3.cliente = "Edlson Santos";
		cc3.saldo = 1200;
		System.out.println("Cliente: " + cc3.cliente);
		cc3.exibirSaldo();

	}

}
