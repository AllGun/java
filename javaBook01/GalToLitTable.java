/*

	Tente isto 1 - 2

	Este programa exibe uma tabela de conversão de galões em litros.

	Chame-o de "GalToLitTable.java".

*/


class GalToLitTable {

	public static void main (String args[]) {
		
		double gallons , liters;
		
		int counter;

		
		counter = 0; // Inicialment, o contador de linhas é configurado com zero

		for (gallons = 1; gallons <= 100; gallons ++) {

			liters = gallons * 3.7854; // converte para litros
			
			System.out.println(gallons + " gallons is " +
							
							liters + " liters.");


			counter ++; // Incrementa o contador de linhas a cada iteração do loop.
			
			// a cada décima linha, exibe uma linha em branco

			if (counter == 10) { // Se o valor do contador for 10, exibe uma linha em branco.

				System.out.println();
				
				counter = 0; // zera o contador de linhas
				
			
			}		

		}
	}
}