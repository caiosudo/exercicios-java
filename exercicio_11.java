package exercicio_java;

import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//variáveis
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
			System.out.printf("Sua média foi %.2f, você está aprovado", media);
		}
		else if (media < 5) {
			System.out.println("Você foi reprovado");
		}
		else if (media > 5 && media < 6) {
			System.out.println("Você está de recuperação.");
			System.out.println("Insira sua nota da atividade de recuperação");
			notarec = scan.nextInt();
			mediarec = (media + notarec)/2;
			
			if (mediarec < 6) {
				System.out.println("Você foi reprovado.");
			}
			else {
				System.out.println("Graças a sua nova nota você foi aprovado.");
			}
		}
	}
}
