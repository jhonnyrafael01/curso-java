package aula07_06.ENUMS;

public class TesteEnum {

	public static void main(String[] args) {
		
		int sq = SituacaoQuarto.DISPONIVEL.codico;
		
		System.out.println(SituacaoQuarto.valueOf("DISPONIVEL"));
		
		System.out.println(sq);
		System.out.println(SituacaoQuarto.DISPONIVEL.valor);
		
		for (SituacaoQuarto sit : SituacaoQuarto.values()) {
			
			System.out.println(sit);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
