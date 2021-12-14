package aula03;

import javax.swing.JOptionPane;

public class Operadores {

	public static void main(String[] args) {
		//Operadores aritiméticos + - * / %
		int soma = 5 + 9;
		int subtracao = 5 - 9;
		int multiplicacao = 5 * 9;
		double divisao = 5.0 / 9.0;	//double divisao = 5 / (double)9; //divisão double mas o numero é interiro, logo coloca double no numero para ser do tipo float ou double
		int resto = 9 % 5;
		int cast = (int) 3.7;
		
		
		//String idade = JOptionPane.showInputDialog("Digite sua idade");
		
		//int idade_atualizada = Integer.parseInt(idade);		ctra + shif + c = comentar
		/*int idade_atualizada = 20;
		System.out.println(idade_atualizada++);
		
		idade_atualizada = 20;
		
		System.out.println(++idade_atualizada);*/
		
//		int idade_atualizada = 20;
//		int recupera = 20;
//		idade_atualizada+=recupera;
		

		String nome = "João";
		String sobrenome = " da Silva";
		
		String nomeCompleto = nome + sobrenome;
		System.out.println(nomeCompleto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
