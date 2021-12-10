package LacoRepeticao;

import java.util.Scanner;

public class Exe03 {
	/*
	 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int idade,n,contMenos=0,contMais=0;
		
		System.out.println("\nEntre com uma idade: ");
		idade = leia.nextInt(); 
		
		while(idade != -99) {
			if(idade <= 21) {
				contMenos++;
			} 
			else if(idade >= 50 ) {
				contMais++;
			}
			System.out.println("\nEntre com uma idade: ");
			idade = leia.nextInt(); 
		}
		
		System.out.printf("\nO total de pessoas com menos de 20 anos é: %d",contMenos);
		System.out.printf("\nO total de pessoas com mais de 50 anos é: %d",contMais);
	}

}
