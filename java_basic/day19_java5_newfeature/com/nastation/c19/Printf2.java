package com.nastation.c19;

import java.util.Date;

/**
 * 使用printf输出
 */
public class Printf2 {

	public static void main(String[] args) {

		/** * 输出日期类型** */
		// %t表示格式化日期时间类型，%T是时间日期的大写形式，在%t之后用特定的字母表示不同的输出格式
		Date date = new Date();
		long dataL = date.getTime();

		System.out.printf("%1$tF %1$tR", date);
	}
}