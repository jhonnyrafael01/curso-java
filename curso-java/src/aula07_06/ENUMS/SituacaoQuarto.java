package aula07_06.ENUMS;

public enum SituacaoQuarto {

	DISPONIVEL(1, "disponivel"),
	OCUPADO(2, "disponivel"),
	RESRVADO(3, "disponivel"),
	EM_MANUTENCAO(4, "disponivel"),
	FECHADO(5, "disponivel");
	
	Integer codico;
	String valor;
	
	private SituacaoQuarto(Integer codigo, String valor) {
		this.codico = codigo;
		this.valor = valor;
	}
	
	
	
}
