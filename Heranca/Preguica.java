package Heranca;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome,idade);
	}
	
	public void subirArvore() {
		System.out.println("\nA preguiça sobe em árvores!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("\nZzzzzzzAAAAAaaaaaa");
	}
	
	public void mostrarInfos() {
		System.out.println("\nA Preguiça se chama: "+getNome()+" e sua idade é de: "+getIdade()+"\n");
	}

}
