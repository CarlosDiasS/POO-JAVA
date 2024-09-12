package Service;

public class Compra {

	private String nomeProduto;
	private Double valor;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public Double getValor() {
		return valor;
	}

	public Compra(String nomeProduto, Double valor) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Compra [nomeProduto=" + nomeProduto + ", valor=" + valor + "]";
	}
	
	
	

}
