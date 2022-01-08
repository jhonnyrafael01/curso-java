package cursoJava.basico;

public class EstruturaRepeticaoContinuacao {

	public static void main(String[] args) {
		
		String frutas[] = {"maçã","abacaxi","abacate","laranja","uva"};  
		
		for(int x = 0; x<5; x++) {
			
			System.out.println(frutas[x]);
			
		}
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
	}

}
