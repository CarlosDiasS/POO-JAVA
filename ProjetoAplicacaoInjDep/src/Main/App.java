package Main;

import Controller.PagamentoController;
import Utils.EnumFormasPg;

public class App {

	public static void main(String[] args) {

		PagamentoController api = new PagamentoController();
		api.processarPagamento(EnumFormasPg.Pix, 968.3);
	}

}
