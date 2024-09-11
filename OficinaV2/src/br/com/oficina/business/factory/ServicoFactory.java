package br.com.oficina.business.factory;

import br.com.oficina.business.Entity.AutoCenterInterface;
import br.com.oficina.utils.EnumServicos;

public class ServicoFactory {

	public static String executarServico(EnumServicos servico, AutoCenterInterface oficina) {

		switch (servico) {
		case TrocaBateria:
			return oficina.TrocaBateria();
		case TrocaDeOleo:
			return oficina.TrocaDeOleo();
		case TrocaDePneu:
			return oficina.TrocaDePneu();
		case RevisaoAutomotiva:
			return oficina.RevisaoMecanica();
		default:
			return "Servico nao encontrado";
		}

	}

}
