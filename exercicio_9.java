package exercicio_java;

import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//vari�veis
		String vlr;
		System.out.println("****Menu de Op��es *****\n\n1. Somar dois n�meros \n2. Raiz quadrada de um n�mero\n3. Elevar um n�mero a uma pot�ncia \n\n**** Digite a op��o desejada ****");
		vlr = scan.nextLine();
		switch(vlr) {
		case "1":
			System.out.println("some dois numeros");
			break;
		case"2":
			System.out.println("um valor multiplicado por ele mesmo � a raiz");
			break;
		case"3":
			System.out.println("multiplique o valor por ele mesmo pela qantidade fornecida no expoente");
		default:
			System.out.println("digite uma op��o");
		}
	}

}
