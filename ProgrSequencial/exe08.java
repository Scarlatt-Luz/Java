package ProgrSequencial;

import java.util.Scanner;

public class exe08 {
	/*
	 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e 
	 * dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e
	 * os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
	 */

	public static void main(String[] args) {
		double custoFabrica,custoConsumidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de custo de f�brica: ");
		custoFabrica = leia.nextFloat();
		
		custoConsumidor = (custoFabrica*0.73)+custoFabrica;
		
		System.out.printf("\nO valor de custo ao Consumidor ser�: %2.2f",custoConsumidor);
	}

}
