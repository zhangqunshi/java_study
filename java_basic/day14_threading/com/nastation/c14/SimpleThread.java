package com.nastation.c14;

//: c14:SimpleThread.java
//Very simple Threading example.
/**
 * ������ӿɴ��������������߳�, ��ͨ��Ϊÿ���̷߳���
 * һ����һ�޶��ı��(��һ����̬��������),�Ӷ��Բ�ͬ��
 * �߳̽��и���. Thread ��run()����������õ��˸���
 * ÿͨ��һ��ѭ�������ͼ�1 ����Ϊ0 ʱ�����ѭ��
 * ��ʱһ��run()���������̱߳���ֹ����.
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