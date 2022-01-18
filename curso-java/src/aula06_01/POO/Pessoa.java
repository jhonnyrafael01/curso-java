package aula06_01.POO;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private String endereco;
	private boolean mensalidade;
	private String entrada;
	private String saida;
	
	//método construtuor padrão
	public Pessoa() {}
	
	public Pessoa(String nome, int idade, String cpf, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		mensalidade = true;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String mesTaPago() {
		return this.mensalidade?"mensalidade está em dia":"mesalidade atrasada";
	}
	
	public void registroEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	public String toString() {
		return "Nome: " + this.nome+"\nIdade: "+idade+"\nMensalidade: "+mensalidade;
	}

}
