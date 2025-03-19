package exercicio_java;

import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//variáveis
		Double v1, v2, v3;
		//entrada de dados
		System.out.println("Informe os 3 lados do triângulo.");
		v1 = scan.nextDouble();
		v2 = scan.nextDouble();
		v3 = scan.nextDouble();
		if ((v1 + v2 > v3) && (v1 + v3 > v2) && (v2 + v3 > v1)) {
            System.out.println("Seu triângulo existe!");
            if (v1 == v2 && v2 == v3) {
                System.out.println("O triângulo é Equilátero.");
            } else if (v1 == v2 || v1 == v3 || v2 == v3) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Seu triângulo não existe!");
        }
	}
}
