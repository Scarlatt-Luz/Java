package LacoDecisao;

import java.util.Scanner;

public class Exe01 {
	
	/*
	 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	 */

	public static void main(String[] args) {
		int n1,n2,n3,maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro n�mero inteiro: ");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o segundo n�mero inteiro: ");
		n2 = leia.nextInt();
		
		System.out.println("\nDigite o terceiro n�mero inteiro: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.printf("\nO %d � o maior n�mero.",n1);
		} else if(n2 > n1 && n2 > n3) {
			System.out.printf("\nO %d � o maior n�mero.",n2);
		} else if(n3 > n1 && n3 > n2) {
			System.out.printf("\nO %d � o maior n�mero.",n3);
		} else {
			System.out.println("\nFoi digitado apenas n�meros iguais. ");
		}
	}

}
