package LacoDecisao;

import java.util.Scanner;

public class Exe04 {
	/*
	 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
	 */

	public static void main(String[] args) {
		float numero; 
		double x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número qualquer: ");
		numero = leia.nextFloat();
		
		if(numero % 2 == 0) {
			x = Math.sqrt(numero);
			System.out.println("\nA raiz quadrada é: "+x);
		} else {
			x = Math.pow(numero, 2);
			System.out.println("\nA potência ao quadrado é: "+x);
		}

	}

}
