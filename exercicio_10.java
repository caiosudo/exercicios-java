package exercicio_java;

import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//vari�veis
		int horaIn, minIn, horaFn, minFn, inicio, fim;
		int duracao, horas, minutos;
		//entrada de dados
		System.out.println("Informe a hora do in�cio do jogo");
		horaIn = scan.nextInt();
		System.out.println("Informe os minuto do in�cio do jogo");
		minIn = scan.nextInt();
		
		System.out.println("Agora informe a hora do t�rmino do jogo");
		horaFn = scan.nextInt();
		System.out.println("Agora informe minuto do t�rmino do jogo");
		minFn = scan.nextInt();
		
		inicio = horaIn * 60 + minIn;
		fim = horaFn * 60 + minFn;
		
		if (fim >= inicio) {
			duracao = fim - inicio;
		}
		else {
			duracao = (24 * 60 - inicio) + fim;
		}
		
		horas = duracao/60;
		minutos = duracao % 60;
		
		if ((horas == 0) && (minutos == 0)) {
			System.out.println("O jogo pode ter durado 24H ou nunca ocorreu.");
		}
		else {
		System.out.println("A dura��o do jogo foi de " + horas + "h" + minutos + "min.");
		}

	}

}
