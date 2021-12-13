package VetorMatriz;

import java.util.Scanner;

public class Exe04 {
	/*
	 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double[][] matrizUm = new double[2][2];
		double[][] matrizDois = new double[2][2];
		double[][] matrizRes = new double[2][2];
		double soma=0;
		int linha=0,coluna = 0,op=0;
		double valor1 = 1.65464;
		double valor2 = 7.7777776;
		
		System.out.println("\nMATRIZ 1");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				
				System.out.println("\nEntre com um numero: ");

				matrizUm[linha][coluna] = entrada.nextFloat();
			}
		}
		
		System.out.println("\nMATRIZ 2");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				
				System.out.println("\nEntre com um numero: ");

				matrizDois[linha][coluna] = entrada.nextFloat();
			}
		}
		
		System.out.println("\nEscolha uma das opções: ");
		System.out.println("\n(1) somar as duas matrizes");
		System.out.println("\n(2) subtrair a primeira matriz da segunda");
		System.out.println("\n(3) adicionar uma constante as duas matrizes");
		System.out.println("\n(4) imprimir as matrizes");
		op = entrada.nextInt();
		
		switch(op) {
        case 1:
            for(linha=0;linha<2;linha++) {
            	for(coluna=0;coluna<2;coluna++) {
            		matrizRes[linha][coluna] = matrizUm[linha][coluna] + matrizDois[linha][coluna];
            		System.out.printf("\nA soma das duas matrizes é: matriz %.0f \t",matrizRes[linha][coluna]);
            	}
            }
        	 
            break;
        case 2:
        	for(linha=0;linha<2;linha++) {
            	for(coluna=0;coluna<2;coluna++) {
            		matrizRes[linha][coluna] = matrizUm[linha][coluna] - matrizDois[linha][coluna];
                	
                	System.out.printf("\nA subtração das duas matrizes é: %.0f \t",matrizRes[linha][coluna]);
            	}
            }
        	
            break;
        case 3:
        	for(linha=0;linha<2;linha++) {
            	for(coluna=0;coluna<2;coluna++) {
            		matrizUm[linha][coluna] = valor1;
                	matrizDois[linha][coluna] = valor2;
                	
                	System.out.printf("\nA constante das duas matrizes é: %.0f %.0f \t",matrizUm[linha][coluna],matrizDois[linha][coluna]);
            	}
            	}
            break;
        case 4:
        	for(linha=0;linha<2;linha++) {
            	for(coluna=0;coluna<2;coluna++) { 	
        	System.out.printf("\nA constante das duas matrizes é: %.0f %.0f \t",matrizUm[linha][coluna],matrizDois[linha][coluna]);
            	}
            }
            break;
        default: 
            System.out.println("\nOpção inválida!");
        }
	}

}
