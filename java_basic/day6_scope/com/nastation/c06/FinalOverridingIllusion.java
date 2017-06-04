package com.nastation.c06;

/**
 * final 和private 
 * 类内所有private 方法都会默认为final,
 * 可为一个private 方法明确添加final 
 * 指示符但实际效果却并无什么分别
 * 
 * @author kris
 * 
 */
class WithFinals {
	// Identical to "private" alone:
	private final void f() {
		System.out.println("WithFinals.f()");
	}

	// Also automatically "final":
	private void g() {
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}

	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}

	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can't call the methods:
		// ! op.f();
		// ! op.g();
		// Same here:
		WithFinals wf = op2;
		// ! wf.f();
		// ! wf.g();
	}
}