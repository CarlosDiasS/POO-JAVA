package Controller;

import Service.PedidoService;
import Service.Factory.PagamentoFactory;
import Service.Interface.MeioPagamentoInterface;
import Utils.EnumFormasPg;

public class PagamentoController {

	public void processarPagamento(EnumFormasPg EnumPG, double valorPedido) {

		MeioPagamentoInterface meioPagamento = PagamentoFactory.obterMeioPagamento(EnumPG);

		PedidoService pedido = new PedidoService(meioPagamento);

		pedido.FinalizarPedido(valorPedido);

	}
}

//controller se comunica com service, informando o EnumPg e double valorPedido)