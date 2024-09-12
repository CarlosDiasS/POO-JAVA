package main;

import Controller.ApiCartao;
import Controller.ApiLimite;
import Controller.ApiListagem;
import Controller.ApiMenu;

public class App {

	public static void main(String[] args) {

		 // Usa o controller para obter o limite do cartão
        double limite = new ApiLimite().getLimite();

        // Instancia e configura o cartão através do ApiCartao
        ApiCartao apiCartao = new ApiCartao();
        apiCartao.CriarCartao(limite);  // Cria o cartão com o limite

        // Usa o controller ApiMenu para executar o Menu passando o objeto Cartao
        ApiMenu apiMenu = new ApiMenu();
        apiMenu.getMenu(apiCartao.getCartao());

        // Usa o controller para obter a listagem de compras
        ApiListagem listagem = new ApiListagem();
        String listaCompras = listagem.getLista(apiCartao.getCartao());

        // Exibe a lista de compras
        System.out.println(listaCompras);

	}
}
