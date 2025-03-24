package exercicio_java;

import java.util.Scanner;

public class exercicio_13 {

	public static void main(String[] args) {
		// variáveis
		String tipoPlano;
		Scanner scan = new Scanner(System.in);
		// entrada de dados
		System.out.println("Informe seu plano de saúde");
		tipoPlano = scan.next();
		tipoPlano = tipoPlano.toLowerCase();
		switch (tipoPlano) {
			case "básico":
				System.out.println("O valor do plano é R$ 150,00");
				break;
			case "bronze":
				System.out.println("O valor do plano é R$ 220,00");
				break;
			case "prata":
				System.out.println("O valor do plano é R$ 310,00");
				break;
			case "ouro":
				System.out.println("O valor do plano é R$ 450,00");
				break;
			default:
					System.out.println("Plano inválido");
				}
	}

}
