package Controller;

import java.util.Scanner;

public class ApiLimite {

	public double getLimite() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o limite do cartao: ");
		double limite = scanner.nextDouble();

		return limite;
	}

}
