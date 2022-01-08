package cursoJava.basico;

public class EstruturaDecisao {

	public static void main(String[] args) {
		
		String texto = 10==7?"Dez é ogual a sete":"Dez é diferente de sete";
		
		/*if
		int idade = 19;
		if(idade>=18) {
			System.out.println("Já pode tirar a CNH");
		}
		int idade = 17;
		//if-else
		if(idade >=18) {
			System.out.println("Já pode tirar a CNH");
		}else {
			System.out.println("Não tem idade para dirigir");
		}

		String semaforo = "amarelo";
		
		if(semaforo=="verde") {
			
			System.out.println("siga em frente");
			
		}else if(semaforo=="amarelo") {
			
			System.out.println("tenha atenção");
			
		}else if(semaforo=="vermelho") {
			
			System.out.println("pare");
			
		}else {
			System.out.println("Chame a autarquia de trânsito");
		}
		 */
			
		char opcao = 'b';
		
		switch(opcao) {
			case 'a': 
				System.out.println("cadastrar produto");
				break;
			case 'b':
				System.out.println("modificar produto");
				break;
			case 'c':
				System.out.println("sair");
				break;
			default:
				System.out.println("opção inválida");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
