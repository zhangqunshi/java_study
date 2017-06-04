package com.nastation.c14;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * ThreadLocal���������Ϊÿһ���߳�ά�������ĸ�������? ThreadLocal�ڲ�ԭ��
 * 
 * @author who
 * 
 */
public class ThreadLocalDemo {

	private Map values = Collections.synchronizedMap(new HashMap());

	public Object get() {
		Thread curThread = Thread.currentThread();
		Object o = values.get(curThread);
		if (o == null && !values.containsKey(curThread)) {
			o = initialValue();
			values.put(curThread, o);
		}
		return o;
	}

	protected Object initialValue() {
		return null;
	}

}