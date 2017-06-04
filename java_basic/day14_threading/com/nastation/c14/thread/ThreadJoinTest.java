package com.nastation.c14.thread;

public class ThreadJoinTest {

	public static void main(String[] args) {
		ThreadJoin t = new ThreadJoin("First");
		ThreadJoin t1 = new ThreadJoin("Second");
		ThreadJoin t2 = new ThreadJoin("Third");
		ThreadJoin t3 = new ThreadJoin("--Fouth--");

		t.start();
		t1.start();
		t2.start();
		t3.start();

		try {
//			t.join();
//			t1.join();
//			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int index = 0;
		while (index < 10) {
			System.out.println(Thread.currentThread().getName() + ":" + index++);
		}
		System.out.println("END main");
	}

}

class ThreadJoin extends Thread {
	int index = 0;
	ThreadJoin2 join2 = new ThreadJoin2("--Join2--");
	
	public ThreadJoin(String threadName) {
		super(threadName);
		join2.start();
	}

	public void run() {
		while (true) {
			if (index > 50) {
				break;
			}
	
			try {
				join2.join();
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + ":" + index++);
		}
	}
}

class ThreadJoin2 extends Thread {
	int index = 0;
	
	public ThreadJoin2(String threadName) {
		super(threadName);
	}
	
	public void run() {
		while (true) {
			if (index > 10) {
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + ":" + index++);
		}
	}
}