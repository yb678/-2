package com.apesource.demo;

public class demo12 {
	public static void main(String[] args) {
		/**
		 * 数字格式化异常:NumberFormatException
		 *产生原因： 对一个非法的字符串（包含了非数字内容的字符）进行数字转换时，
		 *        会出现NumberFormatException
		 */
		String totalStr = ":3243";
		int total = Integer.parseInt(totalStr);
		double result = total * 0.4;
		System.out.println(result);
	}
}
