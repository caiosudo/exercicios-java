package exercicio_java;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//variaveis
		Double peso, altura, imc;
		//entradas de dados
		System.out.println("Informe o seu peso: ");
		peso = scan.nextDouble();
		
		System.out.println("Informe a sua altura em centímetro: ");
		altura = scan.nextDouble();
	
		imc = (peso/Math.pow(altura, 2))*10000;
		
		if(imc <= 16) {
			System.out.println("Magreza Severa");
		}else if(imc>16 && imc<17) {
			System.out.println("Magreza Moderada");
		}else if(imc>17 && imc<18.5) {
			System.out.println("Magreza Leve");
		}else if(imc>18.5 && imc<25) {
			System.out.println("Normal");
		}else if(imc>25 && imc<30) {
			System.out.println("Obesidade Leve");
		}else if(imc>30 && imc<40) {
			System.out.println("Obesidade Severa");
		}else if(imc>40) {
			System.out.println("Obesidade Mórbida");
		}
		System.out.printf("o se nível de IMC é de:%.2f", imc);
	}

}
