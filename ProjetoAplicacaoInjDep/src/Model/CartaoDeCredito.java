package Model;

import Service.Interface.MeioPagamentoInterface;

public class CartaoDeCredito implements MeioPagamentoInterface  {

	@Override
	public void ProcessarPagamento(double valor) {

		System.out.println("Pagamento no Credito em 1x de: " + valor);
		
		
		
	}

	
}
