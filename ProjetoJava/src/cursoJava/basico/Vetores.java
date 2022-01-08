package cursoJava.basico;

import java.util.ArrayList;

/*
 * Classe que específica a criação e manipulação de Arrays
 * 
 * versão: 1.0
 * 
 * autor: Jhonny Rafael
 * 
 * */
public class Vetores {

	public static void main(String[] args) {
		/*
		//Declaração de um vetor vazio.
		int numeros[] = new int[5];
		
		//Acessando as posiçoes do vetor
		numeros[0]= 10;
		numeros[1]= 20;
		numeros[2]= 30;
		numeros[3]= 40;
		numeros[4]= 50;
		
		System.out.println(numeros[2]);
		
		//Declarando vetor ja com os valores
		char consoantes[] = {'b','c','d','f','g'};
		
		System.out.println(consoantes[4]);
		*/
		
		ArrayList<Integer> pares = new ArrayList<>();
		
		pares.add(2);
		pares.add(5);
		pares.add(6);
		pares.add(28);
		pares.add(14);
		pares.add(7);
		//adicinar na posição 1 o numero 3
		pares.add(1, 3);
		//ordena os numeros
		/*pares.sort(null);
		//removendo o valor pela posição no ArrayList
		pares.remove(1);*/
		
//		System.out.println(pares.get(1));
		
		pares.stream().filter(e->e%2==0).forEach(e -> System.out.println(e));
		
		
		
	}

}
