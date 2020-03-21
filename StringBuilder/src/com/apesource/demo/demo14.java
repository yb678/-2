package com.apesource.demo;

import java.util.UUID;

public class demo14 {
	public static void main(String[] args) {
		
		/**
		 * 运行时错误：（内存溢出错误）lang.OutOfMemoryError
		 */
		String str = "";
		for(int i =0;i<100;i++) {
			str += UUID.randomUUID().toString();//java8当中，+=会隐式的调用StringBuilder进行字符串的拼接操作
			str += str;
			System.out.println(i);
			System.out.println(Integer.MAX_VALUE+"+"+str.length());
		}
	}
}
