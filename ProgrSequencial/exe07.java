package ProgrSequencial;

import java.util.Scanner;

public class exe07 {
	/*
	 *  Um sistema de equações lineares do tipo: ax + by +c, 
	 * pode ser resolvido segundo mostrado abaixo : 
	 * x = ce-bf/ae-bd e y = af-cd/ae-bd
	 */

	public static void main(String[] args) {
		int a,b,c,d,ee,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor para A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o valor para B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o valor para C: ");
		c = leia.nextInt();
		System.out.println("\nDigite o valor para D: ");
		d = leia.nextInt();
		System.out.println("\nDigite o valor para E: ");
		ee = leia.nextInt();
		System.out.println("\nDigite o valor para F: ");
		f = leia.nextInt();
		
		x=(c*ee)-(b*f)/(a*ee)-(b*d);
		
		y=(a*f)-(c*d)/(a*ee)-(b*d);
		
		System.out.printf("\nOs valores de X é: %d",x);
		System.out.printf("\nE Y é: %d",y);
	}

}
