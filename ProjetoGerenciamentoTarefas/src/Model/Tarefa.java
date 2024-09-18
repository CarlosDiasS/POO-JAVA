package Model;

import java.time.LocalDate;

public class Tarefa implements Comparable<Tarefa>{

	private String nome;
	private int prioridade; // 1-alta 5-baixa
	private LocalDate data;

	public Tarefa(String nome, int prioridade, LocalDate data) {
		this.nome = nome;
		this.prioridade = prioridade;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public LocalDate getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Tarefa [nome=" + nome + ", prioridade=" + prioridade + ", data=" + data + "]";
	}

	@Override
	public int compareTo(Tarefa o) {
		return Integer.compare(this.prioridade, o.prioridade);
	}

	

}
