package com.nastation.c19;

import java.util.Date;

/**
 * ʹ��printf���
 */
public class Printf2 {

	public static void main(String[] args) {

		/** * �����������** */
		// %t��ʾ��ʽ������ʱ�����ͣ�%T��ʱ�����ڵĴ�д��ʽ����%t֮�����ض�����ĸ��ʾ��ͬ�������ʽ
		Date date = new Date();
		long dataL = date.getTime();

		System.out.printf("%1$tF %1$tR", date);
	}
}