package com.nastation.c14;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * ThreadLocal是如何做到为每一个线程维护变量的副本的呢? ThreadLocal内部原理
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