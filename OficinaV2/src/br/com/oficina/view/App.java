package br.com.oficina.view;

import br.com.oficina.api.controller.ListaDeOficinas;
import br.com.oficina.api.controller.ServicoAutomotivoApi;
import br.com.oficina.business.dto.ServicoDTO;
import br.com.oficina.utils.EnumOficinas;
import br.com.oficina.utils.EnumServicos;

public class App {

	public static void main(String[] args) {

		// lista de oficinas de acessam getServico(em controller)

		ListaDeOficinas listaOfc = new ListaDeOficinas();
		listaOfc.ExibirServicosDisp();

		// utilizando enum's como parametro, retaorna um servicoReparo
		EnumOficinas oficina = EnumOficinas.Borracharia;
		EnumServicos servico = EnumServicos.TrocaDePneu;
		
		
		ServicoAutomotivoApi api = new ServicoAutomotivoApi();
		
		ServicoDTO servicoDTO = new ServicoDTO(oficina, servico);

		String transacao = api.getServico(servicoDTO);
		System.out.println(transacao);

	}

}

//comunicar com autocenter DTO

