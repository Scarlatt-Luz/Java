package ProgrSequencial;

import java.util.Scanner;

public class exe04 {
	/*
	 * Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	calcule a seguinte expressão:
	D=R+S/2, onde R(A+B)² e S=(B+C)²
	 */

	public static void main(String[] args) {
			
		double a,b,c,d,r,s;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		c = leia.nextInt();
		
		r = Math.pow(a+b, 2);
		s = Math.pow(b+c, 2);
		
		d = (r+s)/2;
		
		System.out.printf("\nO valor da expressão final é: %.2f",d);
	}

}
