package exercicio_java;

import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//variáveis
		Double nota1, nota2, nota3, nota4, media, qntA, qntP, faltas;
		Double por;
		//entrada de dados
		System.out.println("Informe a primeira nota (OBS: notas de 0 a 100): ");
		nota1 = scan.nextDouble();
		System.out.println("Informe a segunda nota (OBS: notas de 0 a 100): ");
		nota2 = scan.nextDouble();
		System.out.println("Informe a terceira nota (OBS: notas de 0 a 100): ");
		nota3 = scan.nextDouble();
		System.out.println("Informe a quarta nota (OBS: notas de 0 a 100): ");
		nota4 = scan.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Informe a quantidade de aulas dadas: ");
		qntA = scan.nextDouble();
		System.out.println("de acordo co as aulas dadas, informe a quantidade de presença do aluno:");
		qntP = scan.nextDouble();
		faltas = qntA - qntP;
		por = faltas*100/qntA;
		if(media>=80 && 0 == faltas) {
			System.out.println("A sua premiação é uma excursão!");
		}else if(media>=80 || 0 == faltas) {
			System.out.println("A sua premiação é uma camiseta!");
		}else if(media>=70 && media>=80 && por<10) {
			System.out.println("A sua premiação é uma Squeeze!");
		}else if(media>=70 && media>=80 || por<10) {
			System.out.println("A sua premiação é uma Caneta personalizada!");
		}else {
			System.out.println("não há premios.");
		}
		System.out.printf("a sua média é de %.2f e a suas faltas são de %.0f porcento", media, por);
	}//umj

}
