package br.com.oficina.business.Entity;

public class AutoCenter implements AutoCenterInterface {

	@Override
	public String TrocaBateria() {
		return "Troca Bateria realizada!";
	}

	@Override
	public String TrocaDeOleo() {
		return "Troca De Oleo realizada!";
	}

	@Override
	public String TrocaDePneu() {
		return "Troca de Pneu Realizada";
	}

	@Override
	public String RevisaoMecanica() {
		return "Revisao Mecaninca Realizada";
	}

}
