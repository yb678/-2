package com.apesource.demo;

import java.util.UUID;

public class demo14 {
	public static void main(String[] args) {
		
		/**
		 * ����ʱ���󣺣��ڴ��������lang.OutOfMemoryError
		 */
		String str = "";
		for(int i =0;i<100;i++) {
			str += UUID.randomUUID().toString();//java8���У�+=����ʽ�ĵ���StringBuilder�����ַ�����ƴ�Ӳ���
			str += str;
			System.out.println(i);
			System.out.println(Integer.MAX_VALUE+"+"+str.length());
		}
	}
}
