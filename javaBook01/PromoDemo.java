// O inesperado em uma promoção!

class PromoDemo {

	public static void main (String args []) {
	
		byte b;

		int i;

		b = 10;
		i = b * b; // Certo, não é necessária uma coerção

		b = 10;
		b = (byte) (b * b); // coerção necessária!!!

		System.out.println("i and b: " + i + " " + b);
	
	}


}