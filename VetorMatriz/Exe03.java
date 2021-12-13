package VetorMatriz;

import java.util.Scanner;

public class Exe03 {
	/*
	 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int[][] valor = new int[3][3];
		int x, cont=0;
		
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um número: ");
				valor[linha][coluna] = leia.nextInt();
				
				if(valor[linha][coluna] > 10) {
					cont++;
				}
			}
		}
		System.out.println("\nContei e foi "+cont+" valores maiores que 10 que ela possui.");
		
	}

}
