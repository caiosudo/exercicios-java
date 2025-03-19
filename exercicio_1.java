package exercicio_java;

import java.util.Scanner;

public class exercicio_1 {

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
		}

	}


