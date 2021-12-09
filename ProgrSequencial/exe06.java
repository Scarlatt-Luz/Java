package ProgrSequencial;

import java.util.Scanner;

public class exe06 {
	
	/*
	 * Construa um programa em java que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
	 * escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
	 * d= √(x2-x1)² + (y2-y1)²
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double x1,x2,y1,y2,d;
		
		System.out.println("\nDigite o valor de X1: ");
		x1 = leia.nextFloat();
		System.out.println("\nDigite o valor de X2: ");
		x2 = leia.nextFloat();
		System.out.println("\nDigite o valor de Y1: ");
		y1 = leia.nextFloat();
		System.out.println("\nDigite o valor de Y2: ");
		y2 = leia.nextFloat();
		
		d = Math.sqrt((x2-x1)+(y2-y1));
		
		System.out.printf("\nA distância entre os dois pontos é: %2.2f",d);
	}

}
