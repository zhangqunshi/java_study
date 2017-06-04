package com.nastation.c14.thread;

/**
 * 演示生产者和消费者问题
 * wait、notify
 * @author who
 * 
 */
public class ProductCustom2 {

	public static void main(String[] args) {
		Queue2 q = new Queue2();
		Producer2 p = new Producer2(q);
		Consumer2 c = new Consumer2(q);
		p.start();
		c.start();
	}
}

class Producer2 extends Thread {
	Queue2 q;

	Producer2(Queue2 q) {
		this.q = q;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			q.put(i);
//			System.out.println("Producer put: " + i);
		}
	}
}

class Consumer2 extends Thread {
	Queue2 q;

	Consumer2(Queue2 q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			q.get();
//			System.out.println("Consumer get: " + q.get());
		}
	}
}

/**
 * 队列
 * 
 * @author who
 * 
 */
class Queue2 {

	// 数据
	int value;
	boolean isFull = false;

	// 放置数据
	public synchronized void put(int v) {
		if (!isFull) {
			value = v;
			System.out.println("Producer put: " + value);
			isFull = true;
			notify();
		}
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 得到数据
	public synchronized int get() {

		if (!isFull) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Customer get: " + value);
		isFull = false;
		notify();

		return value;
	}
}
