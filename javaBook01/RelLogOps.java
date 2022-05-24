// Demonstra os operadores relacionais e lógicos.

class RelLogOps {

	public static void main (String args []) {

		int i, j;
		boolean banana1, banana2;
	
		i = 10; 
		j = 11;

		if (i < j) System.out.println("i < j");
		if (i <= j) System.out.println("i <= j");
		if (i != j) System.out.println("i != j");
		if (i == j) System.out.println("This won't execute");
		if (i >= j) System.out.println("This won't execute");
		if (i > j) System.out.println("This won't execute");


		banana1 = true;
		banana2 = false;

		if (banana1 & banana2) System.out.println("This won't execute");
		if (!(banana1 & banana2)) System.out.println("!(banana1 & banana2) is true");
		if (banana1 | banana2) System.out.println("banana1 | banana2 is true");
		if (banana1 ^ banana2) System.out.println("banana1 ^ banana2 is true");

	}

}