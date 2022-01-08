package aula03.exercicios;

import java.util.Scanner;

public class E03_AlturaInsano {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura");
		
		double altura = scan.nextDouble();
		
		
		//String resposta = (altura > 1.55)?"pode descer no Insano":"Não pode descer no insano";
		
		//1ª primeira condição verifica se a altura não é negativa
		//2ª verifica se a pessoa não tem altura para descer no insano
		//3º varificando se a pessoa não é gigante
		boolean permitido = altura>0 && altura >= 1.55 && altura<=3.5;
		
		String resposta = permitido ?"pode descer no Insano":"Não pode descer no insano";
		
		System.out.println(resposta);
		
		
		
	}

}
