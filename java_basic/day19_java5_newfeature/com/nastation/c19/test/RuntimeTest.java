package com.nastation.c19.test;

import java.io.IOException;

public class RuntimeTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Start");
//		Runtime.getRuntime().exec("notepad");
		Runtime.getRuntime().exec("ipconfig /all");

	}

}
