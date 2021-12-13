package VetorMatriz;

public class Exe01 {
	/*
	 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
	 * O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições 
A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetorNum = {1, 0, 5, -2, -5, 7};
		int somaVetor;
		
		somaVetor = vetorNum[0] + vetorNum[1] + vetorNum[5];
		
		vetorNum[4] = 100;
		
		System.out.println("\nA soma dos vetores A[0], A[1] e A[5] é: "+somaVetor);
		
		//opção d - forma 1
		for(int x=0;x<6;x++) {
			System.out.println("\nCada valor do vetor A é: "+vetorNum[x]);
		}
		
		//opção d - forma 2
		for(int i : vetorNum) {
			System.out.println("\nCada valor do vetor A é: "+i);
		}
		
	}

}
