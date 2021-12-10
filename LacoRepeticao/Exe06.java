package LacoRepeticao;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
			final imprimir a média dos números múltiplos de 3. Para sair digitar
			0(zero).(DO...WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		
		int numero,n = 0,soma=0;
		float media;
		
		System.out.printf("\nDigite números inteiros: ");
		numero = leia.nextInt();
		
		do {
			if(numero % 3 == 0) {
				n++;
				soma += numero;
			}
			System.out.printf("\nDigite números inteiros: ");
			numero = leia.nextInt();
			
		} while(numero > 0);
		
		if(numero != 0) {
			System.out.println("\nSaindo do sistema.");
		}
		media = soma/n;
		System.out.printf("\nA média dos números múltiplos de 3 é de: %f",media);
	}

}
