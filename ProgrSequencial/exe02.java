package ProgrSequencial;

import java.util.Scanner;

public class exe02 {
	/*
	 * 2. Faça um sistema que leia a idade de uma pessoa
	 * expressa em dias e mostre-a expressa em anos, meses e dias.
	 */

	public static void main(String[] args) {
		
		int totalDias, anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPor gentileza, digite a idade de uma pessoa em dias: ");
		totalDias = leia.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		
		System.out.printf("\nA idade em anos é: %d",anos); 
		System.out.printf("\ne em meses é: %d",meses); 
		System.out.printf("\ne dias é: %d",dias);
	}

}
