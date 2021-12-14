package aula03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite seu nome");
		String nome = leitor.nextLine();
		
		String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome");
		
		System.out.println("seu nome é "+nome);
		System.out.println("sobrenome: "+sobrenome);
	}

}
