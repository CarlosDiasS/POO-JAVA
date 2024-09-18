package Service;

import java.util.Comparator;

import Model.Tarefa;

public class ComparadorService implements Comparator<Tarefa> {

	public int compare(Tarefa T1, Tarefa T2) {

		// compara as prioridades(1-alto, 5-baixo)

		if (T1.getPrioridade() != T2.getPrioridade()) {
			return Integer.compare(T1.getPrioridade(), T2.getPrioridade());
		}

		// compara as datas
		else {
			return T1.getData().compareTo(T2.getData());
		}

	}

}
