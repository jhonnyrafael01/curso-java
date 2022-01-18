package aula06_02.POO;

public class TesteObjeto {

	public static void main(String[] args) {
		
//		Pessoa p1 = new Pessoa("Joaquim", 36, "tomé");
		Cliente c1 = new Cliente("Alberto", 28, "Monte Carlo");
		Cliente c2 = new Cliente("lara", 30, "Aldeota");
		Cliente c3 = new Cliente("Livia", 22, "Aldeota");
		
		
		System.out.println(c1.getNome());
		System.out.println(c2.getNome());
		System.out.println(c3.getNome());
		System.out.println(Cliente.verNumeroCliente());
		
		c1.pagarMensalidade();
		c1.pagarMensalidade();
		System.out.println(c1.getMensalidade());
		
	}
}
