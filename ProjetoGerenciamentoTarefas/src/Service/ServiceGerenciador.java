package Service;

import java.time.LocalDate;
import java.util.PriorityQueue;

import Model.Tarefa;

public class ServiceGerenciador {

	private PriorityQueue<Tarefa> filaDeTarefas = new PriorityQueue<>();

	public void adicionarTarefa(String nome, int prioridade, LocalDate dataConclusao) {

		Tarefa tarefa = new Tarefa(nome, prioridade, dataConclusao);
		filaDeTarefas.add(tarefa);
		System.out.println("Tarefa add: " + tarefa);

	}

	public void removerTarefaMaisUrgente() {

		// utilizando a estrutura de dados stack,
		// poll remove a tarefa no topo da pilha

		Tarefa tarefaRemovida = filaDeTarefas.poll();
		if (tarefaRemovida != null) {
			System.out.println("Tarefa removida" + tarefaRemovida);
		} else {
			System.out.println("Nenhuma tarefa disponivel");
		}

	}

	public void listarTarefas() {
		ListarTarefas listarTarefas = new ListarTarefas();
		listarTarefas.Lista(filaDeTarefas);
	}

}
