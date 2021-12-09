package LacoDecisao;

import java.util.Scanner;

public class Exe03 {
	/*
	 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		System.out.printf("\nSua idade: %d",idade);
		
		if(idade <10) System.out.printf("\nNão há categorias para esta idade.");
		else if(idade >= 10 && idade <= 14) {
			System.out.printf("\nVocê está na categoria Infantil.");
		} else if(idade >= 15 && idade <= 17){
			System.out.printf("\nVocê está na categoria Juvenil.");
		} else if(idade >= 18 && idade <= 25){
			System.out.printf("\nVocê está na categoria Adulto.");
		} else {
			System.out.printf("\nNão há categorias para esta idade.");
		}

	}

}
