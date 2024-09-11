package br.com.oficina.business;

import br.com.oficina.business.Entity.AutoCenterInterface;
import br.com.oficina.utils.EnumServicos;

public class ServicoReparo implements AutoCenterInterface {



	public String getServico(EnumServicos servico) {
		return null;
		
	}

	@Override
	public String TrocaBateria() {
		return null;
	}

	@Override
	public String TrocaDeOleo() {
		return null;
	}

	@Override
	public String TrocaDePneu() {
		return null;
	}

	@Override
	public String RevisaoMecanica() {
		return null;
	}
}
///*futuramente, entrar com o parametro de descrcao