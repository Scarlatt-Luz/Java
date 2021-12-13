package VetorMatriz;

import java.util.Scanner;

public class Exe02 {
	/*
	 * 2- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[6];
		int[] numImpar = new int[6];
		int[] contImpar = new int[6];
		int[] numPar = new int[6];
		int i,numSoma=0;
		
		for(i=0;i<6;i++) {
			System.out.println("\nEntre com o número "+i+1+": ");
			numero[i] = entrada.nextInt();
			
			if(numero[i] % 2 == 0) {
				
				numPar[i] = numero[i];
				
				numSoma+=numero[i];
			}
			else {
				numImpar[i] = numero[i];
				contImpar[i]++;
			}
			
			
		}
		
		for(i=0;i<6;i++) {
			System.out.println("\nOs números pares digitados são: "+numPar[i]);
			System.out.println("\nA soma dos números pares digitados é: "+numSoma);
			System.out.println("\nOs números ímpares digitados são: "+numImpar[i]);
			System.out.println("\nA quantidade de números ímpares digitados é: "+contImpar.length);
		}
		
	}

}
