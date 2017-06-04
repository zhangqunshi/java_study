package com.nastation.c06;

class Gizmo {
	public void spin() {
		System.out.println("Gizmo.spin");
	}
}

/**
 * final ²ÎÊý
 * @author kris
 *
 */
public class FinalArguments {
	void with(final Gizmo g) {
		//g = new Gizmo(); // Illegal -- g is final
		g.spin();
	}

	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final
		g.spin();
	}

	//void f(final int i) { i++; } // Can't change
	
	// You can only read from a final primitive:
	int g(final int i) {
		return i + 1;
	}

	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
//		Gizmo a = null;
		bf.without(null);
		//bf.with(null);
                //Gizmo b = new Gizmo();
		//bf.without(b);
		//bf.with(b);
	}
}