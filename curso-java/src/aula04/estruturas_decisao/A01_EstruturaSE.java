package aula04.estruturas_decisao;

public class A01_EstruturaSE  {

	public static void main(String[] args) {
		
		int idade = 18;
		
		//Operador ternario
		String situacao = idade >= 18 ? "Apto para tirar CNH": "Não apto a tirar CNH";
		//System.out.println(idade >= 18 ? "Apto para tirar CNH": "Não apto a tirar CNH");
		
		//boolean podeDirigir = idade >=18 ? true:  false;
		
		//System.out.println("A pessoa está apta a tirar CNH: "+podeDirigir);
		
		boolean podeDirigir;
		
		boolean temDinheiro = true;
	
		String tipoCNH;
		
	/*
		//pagar a própria CNH
		if(idade>=18 && temDinheiro) {
			podeDirigir = true;
			System.out.println("Apto para tirar CNH");
		}else {
			podeDirigir = false;
			System.out.println("Não apto a tirar CNH");
		}
		
		//pode ter direito a CNH popular 
		//não pode ter dinheiro para pagá-la
		//por isso o sinal de negação '!'
		if(idade>=18 && !temDinheiro) {
			podeDirigir = true;
			System.out.println("Apto para tirar CNH");
		}else {
			podeDirigir = false;
			System.out.println("Não apto a tirar CNH");
		}
		
		*/
		if(idade>=18 && temDinheiro) {
			
			podeDirigir =true;
			tipoCNH = "comum";
			
		}else if(idade>=18 && !temDinheiro) {
			
			podeDirigir = true;
			tipoCNH = "CNH popular";
			
		}else {
			podeDirigir = false;
			tipoCNH = "nula";
		}
		
		System.out.println("A pessoa está apta a tirar a CNH: "+podeDirigir);
		System.out.println("tipo de CNH: "+tipoCNH);
		
	}

}
