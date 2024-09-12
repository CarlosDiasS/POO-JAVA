package Controller;

import Service.Cartao;
import Service.ListCompras;

public class ApiListagem {

	public String getLista(Cartao cartao) {

		ListCompras listaCompras = new ListCompras();
		return listaCompras.ImpListaCompras(cartao);

	}
}
