package exercicio_java;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//variáveis
		Double n1, n2, n3;
		//entrada de dados 
		System.out.println("Informe o 1° número: ");
		n1 = scan.nextDouble();
		System.out.println("Informe o 2° número: ");
		n2 = scan.nextDouble();
		System.out.println("Informe o 3° número: ");
		n3 = scan.nextDouble();
		if(n1<n2 && n1<n3) { 
			System.out.println("O número 1 é menor");
		}
		else if(n2<n1 && n2<n3) {
			System.out.println("O número 2 é menor");
		}
		else {
			System.out.println("O número 3 é menor");
		}

	}

}
