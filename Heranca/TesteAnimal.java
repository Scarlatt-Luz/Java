package Heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro dog = new Cachorro("Bebel",2);
		Cavalo horse = new Cavalo("Zé",6);
		Preguica zz = new Preguica("zzzip",4);
		
		dog.correr();
		dog.emitirSom();
		dog.mostrarInfos();
		horse.emitirSom();
		horse.mostrarInfos();
		zz.mostrarInfos();
		zz.emitirSom();
	}

}
