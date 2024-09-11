package br.com.oficina.api.controller;

import br.com.oficina.business.Entity.AutoCenterInterface;
import br.com.oficina.business.dto.ServicoDTO;
import br.com.oficina.business.factory.OficinaFactory;
import br.com.oficina.business.factory.ServicoFactory;

public class ServicoAutomotivoApi {

	private final OficinaFactory oficinaFactory;
	private final ServicoFactory servicoFactory;

	// utiliza as factorys para validar o enumerates passados pela main

	// constructor

	public ServicoAutomotivoApi() {
		this.oficinaFactory = new OficinaFactory();
		this.servicoFactory = new ServicoFactory();
	}

	public String getServico(ServicoDTO servicoDTO) {

		
		
		AutoCenterInterface reparo = OficinaFactory.criarServico(servicoDTO.getOficina());

		return ServicoFactory.executarServico(servicoDTO.getServico(), reparo);
	}

}

//usar FACTORY

//usar DTO PARA TRANSFERIR OS DADOS 
