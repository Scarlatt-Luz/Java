package POO;

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
 */

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente auto1 = new Cliente("Wordison","Cavalcante",111222333,34,1.94,"Rua Apucana, 28, 02555-184.");
		auto1.imprimirInfo();
	}

}
