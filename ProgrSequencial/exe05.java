package ProgrSequencial;

import java.util.Scanner;

public class exe05 {
	/*
	 * 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
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
		
		System.out.printf("\nA m�dia final �: %.2f",media);
	}

}
