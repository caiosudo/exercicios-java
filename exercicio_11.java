package exercicio_java;

import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//vari�veis
		int nota1, nota2, nota3, notarec, media, rec, mediarec;
		//entradas de dados
		System.out.println("Informe a sua primeira nota.");
		nota1 = scan.nextInt();
		System.out.println("Informe a sua segunda nota.");
		nota2 = scan.nextInt();
		System.out.println("Informe a sua terceira nota.");
		nota3 = scan.nextInt();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if (media >= 6) {
			System.out.printf("Sua m�dia foi %.2f, voc� est� aprovado", media);
		}
		else if (media < 5) {
			System.out.println("Voc� foi reprovado");
		}
		else if (media > 5 && media < 6) {
			System.out.println("Voc� est� de recupera��o.");
			System.out.println("Insira sua nota da atividade de recupera��o");
			notarec = scan.nextInt();
			mediarec = (media + notarec)/2;
			
			if (mediarec < 6) {
				System.out.println("Voc� foi reprovado.");
			}
			else {
				System.out.println("Gra�as a sua nova nota voc� foi aprovado.");
			}
		}
	}
}
