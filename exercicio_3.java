package exercicio_java;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//variaveis
		Double nota1, nota2, nota3, nota4, media;
		String nome;
		//entradas de dados
		System.out.println("Informe seu nome");
		nome = scan.nextLine();
		System.out.println("Informe sua primeira nota");
		nota1 = scan.nextDouble();
		System.out.println("Informe sua segunda nota");
		nota2 = scan.nextDouble();
		System.out.println("Informe sua terceira nota");
		nota3 = scan.nextDouble();
		System.out.println("Informe sua quarta nota");
		nota4 = scan.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4)/4;
		if (media<21) {
			System.out.print("péssimo!");}
		else if (media>20 && media<41) {
			System.out.print("Ruim!");}
		else if (media>40 && media<61) {
			System.out.print("Regular!");}
		else if (media>60 && media<81) {
			System.out.print("Bom!");}
		else if (media>80 && media<101) {
		 	System.out.print("Ótimo!");}
		System.out.printf("\nAs suas notas foram: %.1f / %.1f / %.1f / %.1f \n%s, sua média é de %.1f", nota1, nota2, nota3, nota4, nome, media);

	}

}
