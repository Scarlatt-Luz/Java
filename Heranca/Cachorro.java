package Heranca;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade) {
		super(nome,idade);
	}
	
	public void correr() {
		System.out.println("\nZuuuuuuuum");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("\nAuuuuuuuuuuu Auuuuuuuuuu");
	}
	
	public void mostrarInfos() {
		System.out.println("\nO Cachorro se chama: "+getNome()+" e sua idade é de: "+getIdade()+"\n");
	}

}
