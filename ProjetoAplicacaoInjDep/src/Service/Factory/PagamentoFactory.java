package Service.Factory;

import Model.Boleto;
import Model.CartaoDeCredito;
import Model.Paypal;
import Model.Pix;
import Service.Interface.MeioPagamentoInterface;
import Utils.EnumFormasPg;

public class PagamentoFactory {

	//factory para validar a opcao escolhida 
	
	public static MeioPagamentoInterface obterMeioPagamento(EnumFormasPg EnumPG) {
		
		switch (EnumPG) {
		case Pix: {
			return new Pix();
		}
		case CartaoDeCredito:
			return new CartaoDeCredito();
			
		case Boleto:
			return new Boleto();
			
		case Paypal:
			return new Paypal();
		default:
			throw new IllegalArgumentException("Forma de pagamento nao suportada! ");
		}
		
	}
}
