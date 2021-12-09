package LacoDecisao;

import java.util.Scanner;

public class Exe01 {
	
	/*
	 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	 */

	public static void main(String[] args) {
		int n1,n2,n3,maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número inteiro: ");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o segundo número inteiro: ");
		n2 = leia.nextInt();
		
		System.out.println("\nDigite o terceiro número inteiro: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.printf("\nO %d é o maior número.",n1);
		} else if(n2 > n1 && n2 > n3) {
			System.out.printf("\nO %d é o maior número.",n2);
		} else if(n3 > n1 && n3 > n2) {
			System.out.printf("\nO %d é o maior número.",n3);
		} else {
			System.out.println("\nFoi digitado apenas números iguais. ");
		}
	}

}
