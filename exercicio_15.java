package exercicio_java;

import java.util.Scanner;

public class exercicio_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// variáveis
		int codProduto, codPais;
        double pesoKg, pesoGramas, precoPorGrama, precoTotal, imposto = 0.00, valorImposto, valorFinal;
        //entrada de dados
        System.out.println("Informe o código do produto (1 a 10): ");
        codProduto = scan.nextInt();

        System.out.println("Informe o peso do produto (em Kg): ");
        pesoKg = scan.nextDouble();

        System.out.println("Informe o código do país de origem (1 a 3): ");
        codPais = scan.nextInt();
        
        pesoGramas = pesoKg * 1000;

        if (codProduto >= 1 && codProduto <= 4) {
            precoPorGrama = 10.00;
        } else if (codProduto >= 5 && codProduto <= 7) {
            precoPorGrama = 25.00;
        } else {
            precoPorGrama = 35.00;
        }

        precoTotal = pesoGramas * precoPorGrama;

        if (codPais == 1) {
            imposto = 0.00;
            valorImposto = precoTotal * imposto;
            valorFinal = precoTotal + valorImposto;
            
            System.out.println("Peso do produto em gramas: " + pesoGramas + "g");
            System.out.println("Preço total do produto: R$ " + precoTotal);
            System.out.println("Valor do imposto: R$ " + valorImposto);
            System.out.println("Valor final a pagar: R$ " + valorFinal);
        } 
        
        else if (codPais == 2) {
            imposto = 0.15;
            valorImposto = precoTotal * imposto;
            valorFinal = precoTotal + valorImposto;
            
            System.out.println("Peso do produto em gramas: " + pesoGramas + "g");
            System.out.println("Preço total do produto: R$ " + precoTotal);
            System.out.println("Valor do imposto: R$ " + valorImposto);
            System.out.println("Valor final a pagar: R$ " + valorFinal);
        } 
        
        else if (codPais == 3){
            imposto = 0.25;
            valorImposto = precoTotal * imposto;
            valorFinal = precoTotal + valorImposto;
            
            System.out.println("Peso do produto em gramas: " + pesoGramas + "g");
            System.out.println("Preço total do produto: R$ " + precoTotal);
            System.out.println("Valor do imposto: R$ " + valorImposto);
            System.out.println("Valor final a pagar: R$ " + valorFinal);
    	}
        
        else {
        	System.out.println("Código do país inválido");
        }
	}

}
