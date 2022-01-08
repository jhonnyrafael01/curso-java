package aula03.exercicios;

import java.util.Scanner;

public class E02_Desconto {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		double valor = leitor.nextDouble();
		//0.19 = 19/100
		double desconto = valor * 0.19;
		
		double valorFinal = valor - desconto;
		
		System.out.printf("Valor original: %.2f\nDesconto: %.2f\n Valor com desconto: %.2f",valor,desconto,valorFinal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
