package exercicio_java;

import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//vari�veis
		Double v1, v2, v3;
		//entrada de dados
		System.out.println("Informe os 3 lados do tri�ngulo.");
		v1 = scan.nextDouble();
		v2 = scan.nextDouble();
		v3 = scan.nextDouble();
		if ((v1 + v2 > v3) && (v1 + v3 > v2) && (v2 + v3 > v1)) {
            System.out.println("Seu tri�ngulo existe!");
            if (v1 == v2 && v2 == v3) {
                System.out.println("O tri�ngulo � Equil�tero.");
            } else if (v1 == v2 || v1 == v3 || v2 == v3) {
                System.out.println("O tri�ngulo � Is�sceles.");
            } else {
                System.out.println("O tri�ngulo � Escaleno.");
            }
        } else {
            System.out.println("Seu tri�ngulo n�o existe!");
        }
	}
}
