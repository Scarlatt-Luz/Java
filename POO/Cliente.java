package POO;

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
 */

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private float cpf;
	private int idade;
	private double altura;
	private String endereco;
	
	public Cliente (String nome,String sobrenome,float cpf,int idade, double altura, String endereco)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.endereco = endereco;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nU cliente é "+nome+" "+sobrenome+" com o CPF "+cpf+" de idade "+idade+". Sua altura é: "+altura+" e com o endereço "+endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getCpf() {
		return cpf;
	}

	public void setCpf(float cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}
