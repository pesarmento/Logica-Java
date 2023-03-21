package br.com.logica.inicio;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		
		double preco, taxa, valor, total;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Preço do Produto:");
		preco = entrada.nextDouble();
		
		System.out.println("Digite a Taxa de Desconto Sem %:");
		taxa = entrada.nextDouble();
		
		valor = preco * (taxa/ 100);
		
		total = preco - valor;
		
		System.out.println("O Valor de desconto é:" +valor);
		System.out.println("O Valor Final é:" +total);

	}

}
