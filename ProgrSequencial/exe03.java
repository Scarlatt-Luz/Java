package ProgrSequencial;

import java.util.Scanner;

public class exe03 {
	/*
	 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 */

	public static void main(String[] args) {
		
		int totalSegundos,horas,minutos,segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a dura��o de um evento de uma f�brica em segundos: ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;
		
		System.out.printf("\nA quantidade de horas � de: %d",horas);
		System.out.printf("\nA quantidade de minutos � de: %d",minutos);
		System.out.printf("\nA quantidade de segundos � de: %d",segundos);

	}

}
