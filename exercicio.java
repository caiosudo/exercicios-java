

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// variaveis
		int n1, n2;
		Scanner scan = new Scanner(System.in);
		// entrada de dados
		System.out.println("Informe os 2 números: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();

		if (n1 == n2) {
			System.out.println("Os dois números são iguais");
		} else if (n1 > n2) {
			System.out.println("o primeiro número é maior que o segundo");
		} else {
			System.out.println("O primeiro número é menor que o segundo");
		}
		
		System.out.println(n1 == n2 ? "números iguais" : n1 > n2 ? "n1 maior" : "n2 maior");
	}

}
