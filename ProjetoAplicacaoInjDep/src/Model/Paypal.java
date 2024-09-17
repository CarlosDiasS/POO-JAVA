package Model;

import Service.Interface.MeioPagamentoInterface;

public class Paypal implements MeioPagamentoInterface {

	@Override
	public void ProcessarPagamento(double valor) {

		System.out.println("Pagamento via Paypal no valor de: " + valor);

	}

}
