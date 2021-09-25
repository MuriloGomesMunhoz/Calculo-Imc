package ex1;

import java.util.Scanner;

import calcula.calculo;

public class imc1 {

	public static void main(String[] args) {
		final var calculo = new calculo();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digete seu nome: ");
		final var nome = scan.nextLine();
		System.out.println("Digete sua peso: ");
		final var peso = scan.nextDouble();
		System.out.println("Digete sua altura: ");
		final var altura = scan.nextDouble();
		
		pessoa p = new pessoa(nome, peso, altura);
		
		final var imc = calculo.calcula(p);
		
		
		System.out.printf("Seu imc: %2f", imc);
				
	}

}
