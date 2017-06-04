package com.nastation.c06;

/**
 * 向上强制转型
 * 
 * @author kris
 * 
 */
class Instrument {
	public void play() {
		System.out.println("playing");
	}

	static void tune(Instrument i) {
		// ...
		i.play();
	}
}

// Wind objects are instruments
// because they have the same interface:
class Wind extends Instrument {
	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute); // Upcasting
	}
}
