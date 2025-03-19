package exercicio_java;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//variáveis
		Double slr, slrmenor, slrentre, slrmaior;
		//entrada de dados
		System.out.println("Informe o valor do seu salário: R$");
		slr = scan.nextDouble();
		slrmenor = slr*1.1;
		slrentre = slr*1.08;
		slrmaior = slr*1.05;
		if(slr<=2000 && slr<=2500) {
			System.out.printf("a sua boneficação é de 10%, salário = %.2f", slrmenor);
		}else if(slr>=2000 && slr<=3000 && slr>=2500) {
			System.out.printf("a sua boneficação é de 8%, salário = %.2f", slrentre);
		}else if(slr>=2500 && slr>=3000) {
			System.out.printf("a sua boneficação é de 5%, salário = %.2f", slrmaior);
		}else {
			System.out.println("esse é o valor");
		}
	}

}
