package Collection;

/* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	programa deverá atender as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
 */

import java.util.List;

public class Estoque {
	
	private List<Produto> listaProdutos;
	
	public Estoque(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	//armazenando dados na list
	public void armazenarDados(String nome, int preco, double quant) {
		
		Produto produto = new Produto(nome, preco, quant);
		listaProdutos.add(produto);
	}
	
	//remover dados da list
	public Produto removerDados(String nome) {
		int x;
			for(x=0;x<listaProdutos.size();x++) {
				if(listaProdutos.get(x).getNome()==nome) {
					break;
				}
			}
			if(listaProdutos.size()<=x) {
				return null;
			}
			return listaProdutos.remove(x);
	}
	
	//atualizar dados da list
	public Produto atualizarProduto(String nome,int quantidade, float preco)
	{
		int x;
		
		for(x=0;x<listaProdutos.size();x++){
			if(listaProdutos.get(x).getNome()==nome){
				
				Produto produto= listaProdutos.get(x);
				produto.setQuant(quantidade);
				produto.setPreco(preco);
				
				return produto;
			}
		}
		
			return null;
	}
	
	//apresentar dados da list
	public void apresentarLista()
	{
		for(Produto produto:listaProdutos)
		{
			System.out.println("Nome: "+produto.getNome()+"\tPreço: "+produto.getPreco()+"\tQuantidade: "+produto.getQuant()+"\n");
		}
	}

}
