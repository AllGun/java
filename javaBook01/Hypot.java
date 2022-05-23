/*

	Usa o teorema de Pitágoras para encontrar o comprimento da hipotenusa
	dados os comprimentos dos dois lados opostos.

*/

class Hypot {
	
	public static void main (String args [ ]) {

		double x, y, z;

		x = 3;
		y = 4;

		// Observe que sqrt() é chamado.
		// Ele é precedido pelo nome da classe da qual é membro
		z = Math.sqrt(x * x + y * y); 
		
		

		System.out.println("Hypotenuse is " + z);

	}

}