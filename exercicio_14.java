package exercicio_java;

import java.util.Scanner;

public class exercicio_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//vari�veis
		double valor, quantidade, total;
		String codigo;
		//entrada de dados
		System.out.println("Informe o c�digo do produto.");
		codigo = scan.nextLine();
		System.out.println("Insira a quantidade comprada.");
		quantidade = scan.nextDouble();
		
		if (codigo.equals("A001")) {
			total = 7.50 * quantidade;
			System.out.println("O pre�o total devido pelo cliente � de " + total);
		}
		else if (codigo.equals("A002")) {
			total = 9.90 * quantidade;
			System.out.println("O pre�o total devido pelo cliente � de " + total);
		}
		else if (codigo.equals("A003")) {
			total = 14.00 * quantidade;
			System.out.println("O pre�o total devido pelo cliente � de " + total);
		}
		else if (codigo.equals("A004")) {
			total = 19.99 * quantidade;
			System.out.println("O pre�o total devido pelo cliente � de " + total);
		}
		else {
			System.out.println("C�digo inv�lido");
		}
	}

}
