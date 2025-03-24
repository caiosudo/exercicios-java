package exercicio_java;

import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//variáveis
		String vlr;
		System.out.println("****Menu de Opções *****\n\n1. Somar dois números \n2. Raiz quadrada de um número\n3. Elevar um número a uma potência \n\n**** Digite a opção desejada ****");
		vlr = scan.nextLine();
		switch(vlr) {
		case "1":
			System.out.println("some dois numeros");
			break;
		case"2":
			System.out.println("um valor multiplicado por ele mesmo é a raiz");
			break;
		case"3":
			System.out.println("multiplique o valor por ele mesmo pela qantidade fornecida no expoente");
		default:
			System.out.println("digite uma opção");
		}
	}

}
