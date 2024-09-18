package Controller;

import java.time.LocalDate;

import Service.ServiceGerenciador;
import Service.ServiceMenu;

public class ControllerTarefas {

	private ServiceGerenciador gerenciador = new ServiceGerenciador();
	
	public void adicionarTarefa(String nome,int prioridade, LocalDate dataConclusao) {
		gerenciador.adicionarTarefa(nome, prioridade, dataConclusao);
	}
	
	public void removerTarefaMaisUrgente() {
		gerenciador.removerTarefaMaisUrgente();
	}
	
	public void listarTarefas() {
		gerenciador.listarTarefas();
	}
	
	public void MenuSeletivo() {
		ServiceMenu menu = new ServiceMenu();
		menu.MenuSeletivo();
		
	}
}
