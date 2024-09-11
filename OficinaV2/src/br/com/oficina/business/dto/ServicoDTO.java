package br.com.oficina.business.dto;

import br.com.oficina.utils.EnumOficinas;
import br.com.oficina.utils.EnumServicos;

public class ServicoDTO {

	private EnumOficinas oficina;
	private EnumServicos servico;

	public ServicoDTO(EnumOficinas oficina, EnumServicos servico) {
		this.oficina = oficina;
		this.servico = servico;
	}

	public EnumOficinas getOficina() {
		return oficina;
	}

	public void setOficina(EnumOficinas oficina) {
		this.oficina = oficina;
	}

	public EnumServicos getServico() {
		return servico;
	}

	public void setServico(EnumServicos servico) {
		this.servico = servico;
	}

}
