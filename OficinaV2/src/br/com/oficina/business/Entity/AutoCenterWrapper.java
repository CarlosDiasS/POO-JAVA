package br.com.oficina.business.Entity;

public class AutoCenterWrapper implements AutoCenterInterface {

	@Override
	public String TrocaBateria() {
		return "Nao realizo troca de bateria";
	}

	// msm esquema
	@Override
	public String TrocaDeOleo() {
		return "Nao realizo troca de oleo";
	}

	@Override
	public String TrocaDePneu() {
		return "Nao realizo troca de Pneu";
	}

	@Override
	public String RevisaoMecanica() {
		return "Nao realizo servicos mecanicos";
	}

}
