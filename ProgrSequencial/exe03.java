package ProgrSequencial;

import java.util.Scanner;

public class exe03 {
	/*
	 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 */

	public static void main(String[] args) {
		
		int totalSegundos,horas,minutos,segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a duração de um evento de uma fábrica em segundos: ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;
		
		System.out.printf("\nA quantidade de horas é de: %d",horas);
		System.out.printf("\nA quantidade de minutos é de: %d",minutos);
		System.out.printf("\nA quantidade de segundos é de: %d",segundos);

	}

}
