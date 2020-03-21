package com.apesource.demo;

public class demo01 {
	public static void main(String[] args) {
		/**
		 * StringBuilder:
		 * 1.是一个可变的字符串序列
		 * 2.对于字符串的修改，是对当前字符串的内容的修改
		 */
		String str = "ABC";
		str = str + "xyz";//拼接后产生的字符串结果，重新保存至str
		
		//替换操作
		str = str.replaceAll("xyz", "甲乙丙");
		System.out.println("String = "+str);
		
		StringBuilder sb = new StringBuilder("ABC");
		sb.append("xyz");//在StringBuilder原来的内容后面，追加新的字符串
		
		//替换操作
		sb.replace(3, 6, "甲乙丙");
		System.out.println("StringBuilder = "+sb);
	}
}
