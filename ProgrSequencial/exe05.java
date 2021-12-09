package ProgrSequencial;

import java.util.Scanner;

public class exe05 {
	/*
	 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
	respectivamente.
	 */

	public static void main(String[] args) {
		
		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor da nota 1: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite o valor da nota 2: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite o valor da nota 3: ");
		n3 = leia.nextFloat();

		media = (n1+n2+n3)/3;
		
		System.out.printf("\nA média final é: %.2f",media);
	}

}
