package com.apesource.demo;

public class demo11 {
	public static void main(String[] args) {
		/**
		 * 字符串下标越界异常：StringIndexOutOfBoundsException
		 * 产生原因：试图用一个不存在的下标，去访问字符串的某一位置
		 */
		String str = "刘昊然的女朋友";
		String result1 = str.substring(0,3);
		
		String result2 = str.substring(4,8);
		System.out.println(result1);
		System.out.println(result2);
	}
}
