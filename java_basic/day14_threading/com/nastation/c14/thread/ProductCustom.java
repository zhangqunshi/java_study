package com.nastation.c14.thread;

/**
 * 演示生产者和消费者问题
 * 
 * @author who
 * 
 */
public class ProductCustom {

	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
	}
}

class Producer extends Thread {
	Queue q;

	Producer(Queue q) {
		this.q = q;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			q.put(i);
			System.out.println("Producer put: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class Consumer extends Thread
{
	Queue q;
	
	Consumer(Queue q) {
		this.q = q;
	}
	
	public void run() {
		while(true) {
			int i = q.get();
			System.out.println("Consumer get: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

/**
 * 队列
 * 
 * @author who
 * 
 */
class Queue {

	// 数据
	int value;

	// 放置数据
	public void put(int v) {
		value = v;
	}

	// 得到数据
	int get() {
		return value;
	}
}
