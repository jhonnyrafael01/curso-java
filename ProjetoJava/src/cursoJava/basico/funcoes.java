package cursoJava.basico;
/*
 * Classe que exemplifica funções
 * 
 * Versão: 1.0
 * 
 * Autor: jhonny rafael
 * 
 * */
public class funcoes {

	public static void main(String[] args) {
		
		int result = soma(10,60);
		
		System.out.println(result);
		
		
		quadrado(7);
		
	//	String texto = mensagem();
	//	System.out.println(texto);
		System.out.println(mensagem());
		
		olaMundo();

	}
	
	//função com retorno do tipo int e recebe dois parâmetros
	static int soma(int a, int b) {
		return a + b;
	}
	
	//função com parametro e não retorna nada 
	static void quadrado(int numero) {
		System.out.println(numero*numero);
	}
	
	//função que n tem parâmetro mas retorna algo
	static String mensagem() {
		return "Menssagem do sistema";
	}
	
	//não recebe parâmetro e não retorna nada mas que imprime uma mensagem
	static void olaMundo() {
		System.out.println("olá Mundo");
	}

}
