package com.apesource.demo;

public class demo02 {
	public static void main(String[] args) {
		//把StringBuilder转化成String
		
		StringBuilder sb = new StringBuilder("ABCD");
		sb.append("abcd");
		sb.append("123456");

		//方法一
		String str1 = String.valueOf(sb);
		System.out.println(str1);
		
		//方法二
		String str2 = sb.toString();
		System.out.println(str2);
	}
}
