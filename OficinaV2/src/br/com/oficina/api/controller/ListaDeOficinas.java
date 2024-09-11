package br.com.oficina.api.controller;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

import br.com.oficina.utils.EnumOficinas;
import br.com.oficina.utils.EnumServicos;

public class ListaDeOficinas {

	// nova solucao

	// mapear os servicos disponiveis por enumOficinas

	// chave enumOfc ,

	private final Map<EnumOficinas, List<EnumServicos>> servicosPerOfc;
	// private final ServicoAutomotivoApi api;

	public ListaDeOficinas() {
		servicosPerOfc = new EnumMap<>(EnumOficinas.class);

		// put dos servicos que cada ofc oferece

		// indexando um array dos servicos presentes em cada enumServicos
		// de acordo com cada EnumOficinas

		servicosPerOfc.put(EnumOficinas.AutoCenter, Arrays.asList(EnumServicos.values()));
		servicosPerOfc.put(EnumOficinas.Borracharia, Arrays.asList(EnumServicos.values()));
		servicosPerOfc.put(EnumOficinas.LojaDeBateria, Arrays.asList(EnumServicos.values()));
		servicosPerOfc.put(EnumOficinas.LojaDeOleo, Arrays.asList(EnumServicos.values()));

	}

	// gpt ajudou a usar o map e indexar os valores

	public void ExibirServicosDisp() {

		for (EnumOficinas oficina : EnumOficinas.values()) {
			System.out.println("Servicos disponvieis para: " + oficina + "\n");

			List<EnumServicos> servicos = servicosPerOfc.get(oficina);
			if (servicos != null) {
				for (EnumServicos servico : servicos) {
					System.out.println("-" + servico + "\n");
				}

			} else {
				System.out.println("Nenhum Servico disponivel");
			}
		}

	}

	/*
	 * private List<EnumOficinas> oficinas = Arrays.asList(EnumOficinas.values());
	 * private ServicoAutomotivoApi servicoApi;
	 * 
	 * //construtor
	 * 
	 * public ListaDeOficinas() { this.servicoApi = new ServicoAutomotivoApi(); }
	 * 
	 * //metodo para obter as oficinas disponiveis, usando getServicos para os
	 * //servicos disponiveis
	 * 
	 * public void ExibirServicosDisp() {
	 * 
	 * for(EnumOficinas oficina : oficinas) {
	 * System.out.println("Serviços disponiveis para a oficina " +oficina + "\n");
	 * 
	 * for (EnumServicos servico : EnumServicos.values()) { System.out.println("-" +
	 * servico); }
	 * 
	 * System.out.println();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * //metodo generico, caso uma oficina nao possua todos os servicos, ainda sim
	 * sera exibido
	 * 
	 */
}
//retornar toos as ofc inseridas no factory 
//retornando os servicos prestados