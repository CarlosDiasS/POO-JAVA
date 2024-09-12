package Service;

import java.util.Scanner;

public class Menu {

	public void MenuSeletivo(Cartao cartao) {
		Scanner scanner = new Scanner(System.in);

		int opcao = -1; // Inicializa com um valor que não seja 0 nem 1

		while (opcao != 1) {

			System.out.println("Selecione a opção:");
			System.out.println("0 - Realizar compra");
			System.out.println("1 - Sair");

			// Verifica se a entrada é um número
			if (!scanner.hasNextInt()) {
				System.out.println("Entrada inválida. Por favor, digite 0 para compra ou 1 para sair.");
				scanner.next(); // Limpa o buffer
				continue;
			}

			opcao = scanner.nextInt();

			if (opcao == 1) {
				System.out.println("Saindo...");
				break; // Sai do loop
			} else if (opcao == 0) {
				System.out.println("Digite o nome do item:");
				String descricao = scanner.next();

				System.out.println("Digite o valor da compra: ");
				double valor = scanner.nextDouble();

				// Verifica se o valor da compra é maior que 0
				if (valor <= 0) {
					System.out.println("Valor inválido. A compra deve ter um valor maior que 0.");
					continue; // Continua o loop
				}

				Compra compra = new Compra(descricao, valor);
				boolean compraRealizada = cartao.LancarCompra(compra);

				if (compraRealizada) {
					System.out.println("Compra efetuada com sucesso!");
				} else {
					System.out.println("Limite insuficiente. Compra não realizada.");
				}
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

		scanner.close();
	}
}
