package br.com.oficina.api.controller;

import br.com.oficina.business.Entity.AutoCenterInterface;
import br.com.oficina.business.dto.ServicoDTO;
import br.com.oficina.business.factory.OficinaFactory;
import br.com.oficina.business.factory.ServicoFactory;
import br.com.oficina.utils.EnumOficinas;
import br.com.oficina.utils.EnumServicos;

public class ServicoAutomotivoApi {

	private final OficinaFactory oficinaFactory;
	private final ServicoFactory servicoFactory;

	// utiliza as factorys para validar o enumerates passados pela main

	// constructor // controller vai chamar dto e o dto vai chamar as duas factorys

	public ServicoAutomotivoApi(EnumOficinas oficina, EnumServicos servico) {

		this.oficinaFactory = new OficinaFactory();
		this.servicoFactory = new ServicoFactory();

		ServicoDTO servicoDTO = new ServicoDTO(oficina, servico);
		String transacao = this.getServico(servicoDTO);
		System.out.println(transacao);

	}

	public String getServico(ServicoDTO servicoDTO) {

		AutoCenterInterface reparo = OficinaFactory.criarServico(servicoDTO.getOficina());

		return ServicoFactory.executarServico(servicoDTO.getServico(), reparo);
	}

}

//usar FACTORY

//usar DTO PARA TRANSFERIR OS DADOS 
