package exercicio_java;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//vari�veis
		Double n1, n2, n3;
		//entrada de dados 
		System.out.println("Informe o 1� n�mero: ");
		n1 = scan.nextDouble();
		System.out.println("Informe o 2� n�mero: ");
		n2 = scan.nextDouble();
		System.out.println("Informe o 3� n�mero: ");
		n3 = scan.nextDouble();
		if(n1<n2 && n1<n3) { 
			System.out.println("O n�mero 1 � menor");
		}
		else if(n2<n1 && n2<n3) {
			System.out.println("O n�mero 2 � menor");
		}
		else {
			System.out.println("O n�mero 3 � menor");
		}

	}

}
