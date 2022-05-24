/*

	Este programa tenta declarar uma variável em um escopo interno com 
	o mesmo nome de uma definida em um escopo externo

*/

class NestVar {

	public static void main (String args []) {

		int count;

		for (count = 0; count < 10; count ++) {
			
			//int count = 0; // aqui não podemos declarar count novamente
			// count já foi declarada no escopo externo

			int julia;
		
		}
		
		int julia = 0;		

	}

}

/*
		Uma dúvida minha: no programa acima, a var count foi declarada
		acima do bloco que tenta criar uma variavel que já foi declarada.
		O que será que acontece se eu declarar uma variável que ja foi declarada
		dentro de um bloco interno após esse bloco?
		No meu entender teria que ter a mesma impossibilidade que ocorre acima.

*/