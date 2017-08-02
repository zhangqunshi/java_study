class SelfBounded<T extends SelfBounded<T>> {
	T element;
	SelfBounded<T> set(T arg) {
		element = arg;
		return this;
	}

	T get() {
		return element;
	}
}

class A extends SelfBounded<A> {}

class B extends SelfBounded<A> {}

class D {}

// class E extends SelfBounded<D> {} // Error
