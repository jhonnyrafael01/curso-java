package aula06_02.POO;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

	private List<Boolean> mensalidade = new ArrayList<Boolean>();
	private boolean ativo;
	static int numClientes;

	public Cliente(String nome, int idade, String endereco) {
		super(nome, idade, endereco);
		ativo = true;
		numClientes++;
	}

	public List<Boolean> getMensalidade() {
		return mensalidade;
	}

	public void pagarMensalidade() {
		this.mensalidade.add(true);
	}

	public void setMensalidade(int indice, boolean valor) {
		if (indice <= this.mensalidade.size()) {
			this.mensalidade.add(indice, valor);
		} else {
			System.out.println("mês inválido");
		}
	}
	public void setMensalidade(List<Boolean> mensalidade) {
		this.mensalidade = mensalidade;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public boolean isAtivo() {
		return ativo;
	}

	public static int verNumeroCliente(){
		return numClientes;
	}

	@Override
	public String toString() {
		return "Cliente [nome= " + this.getNome() + ", idade=" + this.getIdade() + ", endereço=" + this.getEndereco() + "]";
	}

	
	
}
