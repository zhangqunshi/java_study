package com.nastation.c10;

//: c10:Human.java
//Catching exception hierarchies.
class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

public class Human {
	public static void main(String[] args) {
		try {
			throw new Sneeze();
		} catch (Annoyance a) {
			System.err.println("Caught Annoyance");
		} 
//		catch (Sneeze s) {
//			System.err.println("Caught Sneeze");
//		}
	}
}