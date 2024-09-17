package Service;

import Service.Interface.MeioPagamentoInterface;

public class PedidoService {

	private MeioPagamentoInterface meioPagamento;

	// injecao de dependencia via construtor

	public PedidoService(MeioPagamentoInterface meioPagamento) {
		this.meioPagamento = meioPagamento;
	}

	// utilizando um metodo do parametro injetado pelo construtor
	// como implementa interface, possui o metodo ProcessarPagamento

	public void FinalizarPedido(double valor) {
		System.out.println("Finalizando o pedido de valor: R$:" + valor);
		meioPagamento.ProcessarPagamento(valor);

	}

}
