package Collection;

import java.util.ArrayList;

public class TesteEstoque {
	
	/* 
	 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa deverá atender as seguintes funcionalidades:
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estoque loja= new Estoque(new ArrayList<Produto>());
		
		System.out.println("Armazenando os produtos abaixo no sistema\n");
		loja.armazenarDados("Amendoim", 1, 9.9f);
		loja.armazenarDados("Abajur", 320, 5.00f);
		loja.armazenarDados("Guitarra", 900, 10.0f);
		loja.apresentarLista();
		
		System.out.println("\nListando os produtos abaixo no sistema\n");		
		loja.atualizarProduto("Amendoim", 11, 2.45f);
		System.out.println("\n");
		loja.apresentarLista();
		
		System.out.println("\nRemovendo os produtos abaixo no sistema\n");	
		loja.removerDados("Abajur");
		System.out.println("\nE listando novamente\n");
		loja.apresentarLista();
		
		System.out.println("\nAtualizando e listando os produtos abaixo no sistema\n");	
		loja.atualizarProduto("Guitarra", 84, 60.00f);
		System.out.println("\n");
		loja.apresentarLista();
		
		System.out.println("\nRemovendo e listando os produtos abaixo no sistema\n");	
		loja.removerDados("Guitarra");
		System.out.println("\n");
		loja.apresentarLista();

	}

}
