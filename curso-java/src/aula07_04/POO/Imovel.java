package aula07_04.POO;

public abstract class Imovel {
	
	private Long registro;
	private boolean ocupado;
	private Endereco endereco;

	public Imovel() {}
	
	public Imovel(Long registro, Endereco endereco) {
		this.registro = registro;
		this.ocupado = false;
		this.endereco = endereco;
	}

	public Long getRegistro() {
		return registro;
	}

	public void setRegistro(Long registro) {
		this.registro = registro;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public abstract String toString();
	
	
	
	
	
	
}
