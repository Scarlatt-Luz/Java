package LacoRepeticao;

import java.util.Scanner;

public class Exe02 {
	/*
	 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0,x,contPar=0,contImpar=0;
		
		
		
		for(x=0;x<10;x++) {		
			System.out.println("\nEntre com o numero: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				contPar++;
			}
			else {
				contImpar++;
			}
		}

		System.out.printf("\nA quantidade de pares é: %d", contPar);
		System.out.printf("\nA quantidade de ímpares é: %d", contImpar);

	}

}
