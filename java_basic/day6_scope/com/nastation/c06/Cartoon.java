package com.nastation.c06;

/**
 * ��������Ĺ��캯����Java ���Զ�����Ի��๹�캯���ĵ���
 * 
 * @author kris
 * 
 */
class Art {
	
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}

/**
 * ��ʹû��ΪCartoon()����һ�����캯��������Ҳ��Ϊ���� �Զ�
 * �ϳ�һ��Ĭ�Ϲ��캯���������Ի��๹�캯���ĵ���
 * 
 * @author kris
 * 
 */
public class Cartoon extends Drawing {
	Cartoon() {
		System.out.println("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}