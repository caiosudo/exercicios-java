package exercicio_java;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//vari�veis
		Double altura, pIM, pIF;
		String sexo;
		//entrada de dados
		System.out.println("Informe o seu sexo (M ou F)");
		sexo = scan.nextLine();
		System.out.println("Informe a sua altura em cent�metros");
		altura = scan.nextDouble();
		pIM = 52 + (0.75 * (altura - 152.4));
		pIF = 52 + (0.67 * (altura - 152.4));
		if (sexo.equals("M")) {
			System.out.println("Seu peso ideal �: " + pIM);
		}
		else if (sexo.equals("F")) {
			System.out.println("Seu peso ideal �: " + pIF);
		}
		else {
			System.out.println("Informe um sexo v�lido");
		}

	}

}
