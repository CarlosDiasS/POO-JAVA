package Service;

import java.util.List;

public class ListCompras {

	public String ImpListaCompras(Cartao cartao) {

		StringBuilder sb = new StringBuilder();
		
		
		System.out.println("-----------------" + "\n");
		System.out.println("Compras Realizadas:");

		List<Compra> compras = cartao.getCompras();

		if (compras.isEmpty()) {
			System.out.println("Nenhuma compra computada");
		} else {

			for (Compra c : cartao.getCompras()) {
				sb.append(c.getNomeProduto() + "-" + c.getValor() + "\n");
				//sb.(c.getNomeProduto() + "-" + c.getValor());
			}
			sb.append("\n"+"-----------------" + "\n");
			sb.append("Saldo restante: ");
			sb.append( cartao.getSaldo());
			System.out.println();
			System.out.println();

			
		}
		return sb.toString();
	}
}
