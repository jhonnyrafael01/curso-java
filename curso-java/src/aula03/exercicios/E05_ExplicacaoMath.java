package aula03.exercicios;

public class E05_ExplicacaoMath {

	public static void main(String[] args) {
		
		double numero = 3.7;
		int numero02 = 27;
		//retorna o valor absoluto
		Math.abs(numero);
		
		//retorna a raiz cubica
		System.out.println(Math.cbrt(numero02));
	
		//retorna o valor arredonda para cima
		System.out.println(Math.ceil(numero));

		//retorna o valor arredondado para baixo
		System.out.println(Math.floor(numero));
		
		//retorna o valor interio mais proximo
		System.out.println(Math.round(numero));
		
		//retorna o valor maior
		System.out.println(Math.max(numero, numero02));
		
		//retorna o valor menor
		System.out.println(Math.min(numero, numero02));
		
		//Math.random()*numeroMaxiomo retorna um numero aleatorio entre 0 e o numero digitado
		//Math.random()*5)'+2'-> numero minimo vai ser 2 nesse caso
		//Math.random()*20)'-'10 -> numeros negativos
		System.out.println(Math.round(Math.random()*20)-10);


		
		
	}

}
