class Base <T extends Base<T>> {
	T element;
	void set(T t) {
		element = t;
	}
}

class Derived extends Base<Derived> {
}


public class SelfBounded2 {
	public static void main(String[] args) {
		Derived a = new Derived();
		Derived b = new Derived();
		a.set(b);
	}
}
