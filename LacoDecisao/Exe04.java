package LacoDecisao;

import java.util.Scanner;

public class Exe04 {
	/*
	 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
	 */

	public static void main(String[] args) {
		float numero; 
		double x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero qualquer: ");
		numero = leia.nextFloat();
		
		if(numero % 2 == 0) {
			x = Math.sqrt(numero);
			System.out.println("\nA raiz quadrada �: "+x);
		} else {
			x = Math.pow(numero, 2);
			System.out.println("\nA pot�ncia ao quadrado �: "+x);
		}

	}

}
