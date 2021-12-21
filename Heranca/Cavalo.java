package Heranca;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome,idade);
	}
	
	public void correr() {
		System.out.println("\nPotoco Potoco Potoco\n");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("\nIiiiiiooonnnn Iiiiiiooonnnn\n");
	}
	
	public void mostrarInfos() {
		System.out.println("\nO Cavalo se chama: "+getNome()+" e sua idade é de: "+getIdade()+"\n");
	}

}
