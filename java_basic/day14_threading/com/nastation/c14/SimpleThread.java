package com.nastation.c14;

//: c14:SimpleThread.java
//Very simple Threading example.
/**
 * 这个例子可创建任意数量的线程, 并通过为每个线程分配
 * 一个独一无二的编号(由一个静态变量产生),从而对不同的
 * 线程进行跟踪. Thread 的run()方法在这里得到了覆盖
 * 每通过一次循环计数就减1 计数为0 时则完成循环
 * 此时一旦run()方法返回线程便中止运行.
 */
public class SimpleThread extends Thread {
	
	private int countDown = 5;

	private static int threadCount = 0;

	private int threadNumber = ++threadCount;

	public SimpleThread() {
		System.out.println("Making " + threadNumber);
	}

	public void run() {
		while (true) {
			System.out
					.println("Thread " + threadNumber + "(" + countDown + ")");
			if (--countDown == 0)
				return;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new SimpleThread().start();
		System.out.println("All Threads Started");
	}
}