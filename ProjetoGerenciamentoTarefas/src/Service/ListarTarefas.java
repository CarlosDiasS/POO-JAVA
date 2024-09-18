package Service;

import java.util.PriorityQueue;

import Model.Tarefa;

public class ListarTarefas {

	public void Lista(PriorityQueue<Tarefa> filaDeTarefas) {
		if (filaDeTarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa disponivel");
		} else {
			System.out.println("Tarefas: " + "\n");
			for (Tarefa tarefa : filaDeTarefas) {
				System.out.println(tarefa);
			}

		}

	}

}
