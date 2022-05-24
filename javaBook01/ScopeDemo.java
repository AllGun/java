// Demonstra o escopo de bloco

class ScopeDemo {

	public static void main (String args [ ]) {

		int x; //conhecida pelo código dentro de main()

		x = 10;
		if( x == 10) { // a chave inicia novo escopo (bloco)

			int y = 20; // conhecida apenas nesse bloco
			// tanto x quanto y são conhecidas dentro desse bloco

			System.out.println("x and y: " + x + " " + y);

			x = y * 2;
		}

		// y = 100; //
		// y não é conhecida aqui pois foi criada dentro do bloco acima

		System.out.println("x is " + x);
	}

}