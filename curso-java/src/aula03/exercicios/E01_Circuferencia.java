package aula03.exercicios;

import java.util.Scanner;

public class E01_Circuferencia {

	public static void main(String[] args) {
     
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio");
		int raio = leitor.nextInt();
		
		int diametro = raio*2;
		
		double comprimento = 2 * Math.PI * raio; 
		// PI * raio^2
		double area = Math.PI * Math.pow(raio, 2);
	
		System.out.printf("Diâmetro : %d\nCompimento: %.2f\nArea: %.2f",diametro,comprimento,area);
	}

}
