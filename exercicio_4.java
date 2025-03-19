package exercicio_java;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//variaveis
		int n1, n2, n3;
		//entradas de dados 
		System.out.println("informe o primeiro numero: ");
		n1 = scan.nextInt();
		
		System.out.println("informe o segundo numero: ");
		n2 = scan.nextInt();
		
		System.out.println("informe o terceiro numero: ");
		n3 = scan.nextInt();
		
		if(n1<n3 && n1>n3 && n2<n3 && n2>n3) {
			System.out.println("o terceiro numero esta entre o primeiro e o segundo numero");
		}else {
			System.out.println("o terceiro numero não está entre o primeiro e o segundo numero");
		}
		System.out.println(n1<n3 && n1>n3 && n2<n3 && n2>n3 ? "sim" : "não");
	
	}

}
