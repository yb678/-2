package com.apesource.demo;

public class demo02 {
	public static void main(String[] args) {
		//��StringBuilderת����String
		
		StringBuilder sb = new StringBuilder("ABCD");
		sb.append("abcd");
		sb.append("123456");

		//����һ
		String str1 = String.valueOf(sb);
		System.out.println(str1);
		
		//������
		String str2 = sb.toString();
		System.out.println(str2);
	}
}
