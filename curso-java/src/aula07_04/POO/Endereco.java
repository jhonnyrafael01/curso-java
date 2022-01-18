package aula07_04.POO;

public class Endereco {

	private String logradouro;
	private String nome;
	private String numero;
	private String cep;
	
	public Endereco(String logradouro, String nome, String numero, String cep) {
		this.logradouro = logradouro;
		this.nome = nome;
		this.numero = numero;
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", nome=" + nome + ", numero=" + numero + ", cep=" + cep + "]";
	}
	
	
		
	
	
	
	
	
	
}
