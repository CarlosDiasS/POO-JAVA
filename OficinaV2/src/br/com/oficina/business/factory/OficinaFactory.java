package br.com.oficina.business.factory;

import br.com.oficina.business.Entity.AutoCenter;
import br.com.oficina.business.Entity.AutoCenterInterface;
import br.com.oficina.business.Entity.AutoCenterWrapper;
import br.com.oficina.business.Entity.Borracharia;
import br.com.oficina.business.Entity.LojaDeBateria;
import br.com.oficina.business.Entity.LojaDeOleo;
import br.com.oficina.utils.EnumOficinas;

public class OficinaFactory {

	public static AutoCenterInterface criarServico(EnumOficinas oficina) {

		switch (oficina) {
		case AutoCenter:
			return new AutoCenter();

		case Borracharia:
			return new Borracharia();
		case LojaDeBateria:
			return new LojaDeBateria();
		case LojaDeOleo:
			return new LojaDeOleo();
		default:
			return new AutoCenterWrapper();
		}
	}

}
