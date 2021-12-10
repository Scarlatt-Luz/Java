package LacoRepeticao;

import java.util.Scanner;

public class Exe04 {
	/*
	 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		 o número de pessoas calmas;
		 o número de mulheres nervosas;
		 o número de homens agressivos;
		 o número de outros calmos;
		 o número de pessoas nervosas com mais de 40 anos;
		 o número de pessoas calmas com menos de 18 anos.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int pessoa=0,idade,sexo,op,contPesCal=0,contMulNerv=0,contHomAgr=0,contOutCal=0,contPesNerv=0,contPesCalM=0;
		
		while(pessoa<3) {
			
			System.out.println("\nEntre com a idade de uma pessoa: ");
			idade = leia.nextInt(); 
			System.out.println("\nEntre com o número que represente o sexo de uma pessoa: ");
			sexo = leia.nextInt(); 
			
			switch(sexo) {
			case 1:
				System.out.println("\nEntre com o número que represente o comportamento de uma pessoa: ");
				op = leia.nextInt(); 
				
				if(op == 1 && idade < 18) contPesCalM++;contPesCal++;
				 if(op == 2 && idade >= 40) contPesNerv++;
				 	if(op == 2) contMulNerv++;
				 	 if(op == 1) contPesCal++;
				break;
			case 2:
				System.out.println("\nEntre com o número que represente o comportamento de uma pessoa: ");
				op = leia.nextInt();
				
				if(op == 1 && idade < 18) contPesCalM++;contPesCal++;
				 if(op == 2 && idade >= 40) contPesNerv++;
				 	if(op == 3) contHomAgr++;
				 		if(op == 1) contPesCal++;
				break;
			case 3:
				System.out.println("\nEntre com o número que represente o comportamento de uma pessoa: ");
				op = leia.nextInt();
				if(op == 1 && idade < 18) contPesCalM++;contPesCal++;
				 if(op == 2 && idade >= 40) contPesNerv++;
				  if(op == 1) contOutCal++; contPesCal++;
				break;
				
			default:
				System.out.println("\n Opção inválida");
			}	
			pessoa++;
			
		}
		
		System.out.printf("\nO número de pessoas calmas é: %d",contPesCal);
		System.out.printf("\nO número de mulheres nervosas é de: %d",contMulNerv);
		System.out.printf("\nO número de homens agressivos é de: %d",contHomAgr);
		System.out.printf("\nO número de outros calmos é de: %d",contOutCal);
		System.out.printf("\nO número de pessoas nervosas com mais de 40 anos é de: %d",contPesNerv);
		System.out.printf("\nO número de pessoas calmas com menos de 18 anos é de: %d",contPesCalM);
	}

}
