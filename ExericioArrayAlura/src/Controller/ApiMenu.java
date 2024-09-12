package Controller;

import Service.Cartao;
import Service.Menu;

public class ApiMenu {

	public void getMenu(Cartao cartao) {
		Menu menu = new Menu();
		menu.MenuSeletivo(cartao);
	}

}
