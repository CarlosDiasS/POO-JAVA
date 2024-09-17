package Model;

import Service.Interface.MeioPagamentoInterface;

public class Pix implements MeioPagamentoInterface {

	@Override
	public void ProcessarPagamento(double valor) {
		System.out.println("Pix gerado no valor de R$: " + valor);
	}

}
