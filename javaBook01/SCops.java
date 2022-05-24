// Lê um caractere no teclado

class KbIn {

	public static void main (String args [])
	
		trows java.io.IOException {
			
			char ch;

			System.out.print("Press a key followed by Enter: ");
			
			ch = (char) System.in.read();
	
			System.out.println("Your key is: " + ch);

	}

}