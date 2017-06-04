package com.nastation.c06;

class Poppet {
}

/**
 * Blank finals
 * @author kris
 *
 */
class BlankFinal {
	int a;

	final int i = 0; // Initialized final

	final int j; // Blank final
	//static final int j; //error

	final Poppet p; // Blank final reference
	
	// Blank finals MUST be initialized
	// in the constructor:
	BlankFinal() {
		System.out.println("BlankFinal()" + a);
		//System.out.println("BlankFinal()" + j); //error

		j = 1; // Initialize blank final
		//j = 2; //error
		p = new Poppet();
	}

	BlankFinal(int x) {
		j = x; // Initialize blank final
		p = new Poppet();
	}

	public static void main(String[] args) {
		BlankFinal bf = new BlankFinal();
	}
}