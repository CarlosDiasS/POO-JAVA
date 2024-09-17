package Model;

import Service.Interface.MeioPagamentoInterface;

public class Boleto implements MeioPagamentoInterface{

	@Override
	public void ProcessarPagamento(double valor) {
		System.out.println("Gerando boleto bancário de R$:" + valor);
	}

}
