package LacoRepeticao;

import java.util.Scanner;

public class Exe02 {
	/*
	 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
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

		System.out.printf("\nA quantidade de pares �: %d", contPar);
		System.out.printf("\nA quantidade de �mpares �: %d", contImpar);

	}

}
