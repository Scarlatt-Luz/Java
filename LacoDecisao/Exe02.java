package LacoDecisao;

import java.util.Scanner;

public class Exe02 {
	/*
	 * 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,ordCres;
		
		System.out.print("\nDigite o primeiro n�mero inteiro: ");
		n1 = leia.nextInt();
		
		System.out.print("\nDigite o segundo n�mero inteiro: ");
		n2 = leia.nextInt();
		
		System.out.print("\nDigite o terceiro n�mero inteiro: ");
		n3 = leia.nextInt();
		
		if(n1 < n2) {
			if(n2 < n3) {
				System.out.println(n1+", "+n2+", "+n3);
			}
			else if(n1 < n3) {
				System.out.println(n1+", "+n3+", "+n2);
			} else {
				System.out.println(n3+", "+n1+", "+n2);
			}
		} 
		else if(n2 < n3) {
			if(n1 < n3) {
				System.out.println(n2+", "+n1+", "+n3);
			} else {
				System.out.println(n2+", "+n3+", "+n1);
			}
		} else {
			System.out.println(n3+", "+n2+", "+n1);
		}

	}

}
