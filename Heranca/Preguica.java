package Heranca;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome,idade);
	}
	
	public void subirArvore() {
		System.out.println("\nA pregui�a sobe em �rvores!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("\nZzzzzzzAAAAAaaaaaa");
	}
	
	public void mostrarInfos() {
		System.out.println("\nA Pregui�a se chama: "+getNome()+" e sua idade � de: "+getIdade()+"\n");
	}

}
