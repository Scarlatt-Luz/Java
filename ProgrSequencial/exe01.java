package ProgrSequencial;

import java.util.Scanner;

public class exe01 {
	/*
	 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e 
	 * dias e mostre-a expressa apenas em dias.
	 */

	public static void main(String[] args) {
		
		int anos,meses,dias,totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a idade de uma pessoa em anos: ");
		anos = leia.nextInt();
		
		System.out.println("\nDigite a idade de uma pessoa em meses: ");
		meses = leia.nextInt();
		
		System.out.println("\nDigite a idade de uma pessoa em dias: ");
		dias = leia.nextInt();
		
		totalDias = (anos * 365) + (meses * 30) + dias;
				
		System.out.printf("\nTotal é: %d",totalDias," de dias.");
	}

}
