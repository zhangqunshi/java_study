package com.nastation.c19;

/**
 * ��ʾ��������͵��Զ������װ�� װ����ָ��������ͱ����Ӧ�Ķ��� ������ָ����ݶ����ɻ����֡�
 */
public class AutoBox {

	/**
	 * �������͵��Զ������װ�䡣
	 */
	public static void intAutoBox() {
		int i = 100;
		
		// ���Խ����������͸������ֶ���
		// ��J2SE5.0֮ǰ��������iObj = new Integer(200);
		Integer iObj = 200;// ��200װ��
		
		System.out.println("��ʼʱ��i = " + i + "; iObj = " + iObj);
		Integer tempObj = iObj;
		iObj = i;
		
		// �����ֶ��󸳸����������
		// ��J2SE5.0֮ǰ��������i = tempObj.intValue();
		i = tempObj;// ���������
		
		System.out.println("��i��iObj��ֵ������" + "i = " + i + "; iObj = " + iObj);
		
		// �ڱ��ʽ�ڿ����Զ������װ��
		iObj += i + tempObj;
		i *= iObj + tempObj;
		System.out.println("��ӷ��ͳ˷������" + "i = " + i + "; iObj = " + iObj);
	}

	/**
	 * boolean���͵��Զ�������װ��
	 */
	public static void booleanAutoBox() {
		boolean b = false;
		Boolean bObj = true;// װ��
		if (bObj) {// ����
			System.out.println("bObj = " + true);
		}
		if (b || bObj) {
			b = bObj;// ����
			System.out.println("bObj = " + bObj + "; b = " + b);
		}
	}

	/**
	 * �ַ����͵��Զ�������װ��
	 */
	public static void charAutoBox() {
		char ch = 'A';
		Character chObj = 'B';// װ��
		System.out.println("ch = " + ch + "; chObj = " + chObj);
		if (ch != chObj) {// ����
			ch = chObj;// ����
			System.out.println("ch = " + ch + "; chObj = " + chObj);
		}
	}

	public static void main(String[] args) {
		intAutoBox();
		booleanAutoBox();
		charAutoBox();
		// ע�⣬֧�ֻ�������͵��Զ������װ�䣬
		// ���ǲ�֧�ֻ�����������Զ������װ��
		int[] is = { 12, 34, 56 };
		//Integer[] iObjs = is;// error!!!
	}
}
