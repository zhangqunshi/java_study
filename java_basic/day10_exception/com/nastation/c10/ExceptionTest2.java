package com.nastation.c10;

class MyEx3 extends Exception {
}

class Kris2 {
	void m() throws MyEx, MyEx2 {
		System.out.println("kris2 -> m");
		//throw new MyEx();
		 throw new MyEx2();
	}
}

public class ExceptionTest2 extends Kris2 {

//	void m() {}
//	 void m() throws Exception { }
//	 void m() throws MyEx3 {}
//	 void m() throws MyEx {}
//	 void m() throws MyEx2 {}
//	 void m() throws MyEx, MyEx {}
//   void m() throws MyEx, MyEx3 {}
//    void m() throws MyEx, MyEx2, MyEx3 {}

	void m() throws MyEx, MyEx2 {
		System.out.println("ExceptionTest2 -> m");
		throw new MyEx();
	}

	public static void main(String[] args) {
		Kris2 k = new ExceptionTest2();
		//Kris2 k = new Kris2();
		try {
			k.m();
		} catch (MyEx2 me) {
			System.err.println("MyEx2");
		} catch (MyEx me2) {
			System.err.println("MyEx");
		} catch (Exception e) {
			System.err.println("Exception");
		}
	}
}
