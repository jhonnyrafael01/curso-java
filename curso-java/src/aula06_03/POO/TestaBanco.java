package aula06_03.POO;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco b1 = new Banco(1L, "Banco do Brasil");
//		Banco b2 = new Banco(2L, "Caixa");
		
		Conta conta = new Conta(12345L, 15L, "salário", 0, b1);
		
		System.out.println(conta);
		
	}
}
