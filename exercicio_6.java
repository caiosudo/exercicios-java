package exercicio_java;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//vari�veis
		Double slr, slrmenor, slrentre, slrmaior, axacima, axabaixo;
		//entrada de dados 
		System.out.println("Informe o se sal�rio R$:");
		slr = scan.nextDouble();
		slrmenor = slr*1.1;
		slrentre = slr*1.08;
		slrmaior = slr*1.05;
		axabaixo = slrmenor + 350;
		axacima = slrmaior + 300;
		
		if(slr<=2000) {
			System.out.printf("O seu sal�rio recebeu um aumento de 10 porcento, o seu sal�rio atual � de %.2f + ax�lio = %.2f", slrmenor, axabaixo);
		}else if(slr>=2000 && slr<=2500) {
			System.out.printf("O seu sal�rio recebeu um aumento de 8 porcento, o seu sal�rio atual � de %.2f + ax�lio = %.2f", slrentre, axabaixo);
		}else if (slr>=2500 + 300 && slr<=3000) {
			System.out.printf("O seu sal�rio recebeu um aumento de 8 porcento, o seu sal�rio atual � de %.2f + ax�lio = %.2f", slrentre, axacima);
		}else if(slr>3000) {
			System.out.printf("O seu sal�rio recebeu um aumento de 5 porcento, o seu sal�rio atual � de %.2f + ax�lio = %.2f", slrmaior, axacima);
		}else {
			System.out.println("Coloque o valor do se sal�rio!");
		}
		
			
		
	}

}
