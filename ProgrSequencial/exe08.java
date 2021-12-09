package ProgrSequencial;

import java.util.Scanner;

public class exe08 {
	/*
	 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e 
	 * dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e
	 * os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
	 */

	public static void main(String[] args) {
		double custoFabrica,custoConsumidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de custo de fábrica: ");
		custoFabrica = leia.nextFloat();
		
		custoConsumidor = (custoFabrica*0.73)+custoFabrica;
		
		System.out.printf("\nO valor de custo ao Consumidor será: %2.2f",custoConsumidor);
	}

}
