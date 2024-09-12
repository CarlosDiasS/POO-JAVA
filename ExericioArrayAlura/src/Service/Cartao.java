package Service;

import java.util.ArrayList;
import java.util.List;

public class Cartao {

	private Double limite;
	private Double saldo;
	private List<Compra> compras;

	public Double getSaldo() {
		return saldo;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	
	//construtor

	public Cartao(Double saldo, Double limite) {
		this.saldo = saldo;
		this.limite = limite;
		this.compras = new ArrayList<>();
	}

	public Double getLimite() {
		return limite;
	}

	public boolean LancarCompra(Compra compra) {
		if(this.saldo > compra.getValor()) {
			this.saldo -= compra.getValor();
			this.compras.add(compra);
			return true;
		}
		
		return false;
	}
	
	
}
