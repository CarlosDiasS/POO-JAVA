package Controller;

import Service.Cartao;
import Service.Compra;

public class ApiCartao {

	private Cartao cartao;

	public void CriarCartao(double limite) {
		this.cartao = new Cartao(limite, limite);
	}

	public boolean realizarCompra(String descricao, double valor) {
		Compra compra = new Compra(descricao, valor);
		return cartao.LancarCompra(compra);
	}

	public double getSaldo() {
		return cartao.getSaldo();
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

}
