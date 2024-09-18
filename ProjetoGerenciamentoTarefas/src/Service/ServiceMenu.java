package Service;

import java.time.LocalDate;
import java.util.Scanner;

public class ServiceMenu {

	public void MenuSeletivo() {

		Scanner scanner = new Scanner(System.in);
		ServiceGerenciador gerenciador = new ServiceGerenciador();

		while (true) {
			System.out.println("\n" + "Escolha uma opcao");
			System.out.println("1. Adicionar Tarefa");
			System.out.println("2. Remover Tarefa");
			System.out.println("3. Listar Tarefas");
			System.out.println("4. Sair");
			System.out.println("\n");
			int opcao = scanner.nextInt();
			scanner.nextLine();

			if (opcao == 1) {
				System.out.println("Nome da terefa: ");
				String nome = scanner.nextLine();

				System.out.println("Prioridade(1-alta , 5-baixa): ");
				int prioridade = scanner.nextInt();

				System.out.println("Data de conclusao(y-m-d): ");
				String data = scanner.next();
				LocalDate dataConclusao = LocalDate.parse(data);

				gerenciador.adicionarTarefa(nome, prioridade, dataConclusao);
			}

			else if (opcao == 2) {
				gerenciador.removerTarefaMaisUrgente();

			} else if (opcao == 3) {
				gerenciador.listarTarefas();

			} else if (opcao == 4) {
				System.out.println("Saindo");
				break;

			} else {
				System.out.println("Opcao invalida");

			}

		}

		scanner.close();
	}

}
