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

		ServicoAutomotivoApi api = new ServicoAutomotivoApi(EnumOficinas.Borracharia, EnumServicos.TrocaDePneu);

	}

}
