package VetorMatriz;

import java.util.Scanner;

public class Exe02 {
	/*
	 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.

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
			System.out.println("\nEntre com o n�mero "+i+1+": ");
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
			System.out.println("\nOs n�meros pares digitados s�o: "+numPar[i]);
			System.out.println("\nA soma dos n�meros pares digitados �: "+numSoma);
			System.out.println("\nOs n�meros �mpares digitados s�o: "+numImpar[i]);
			System.out.println("\nA quantidade de n�meros �mpares digitados �: "+contImpar.length);
		}
		
	}

}
