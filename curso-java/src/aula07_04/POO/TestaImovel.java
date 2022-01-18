package aula07_04.POO;

public class TestaImovel {

	public static void main(String[] args) {
	
		Endereco end1 = new Endereco("rua", "cearenses", "255", "60111-555");
	
		Apartamento im = new Apartamento(1l,end1, 5.5);
	
	
		System.out.println(im);
	
	
	
	
	
	
	}

}
