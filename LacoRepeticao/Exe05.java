package LacoRepeticao;

import java.util.Scanner;

public class Exe05 {
	/*
	 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,somaNum=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();
			if(num > 0){
				somaNum += num;
				
			}
		} while(num != 0);
		if(num == 0) {
			System.out.println("\nSaindo do sistema...");
		}
		System.out.printf("\nA soma dos n�meros digitados �: %d",somaNum);
		
	}

}
