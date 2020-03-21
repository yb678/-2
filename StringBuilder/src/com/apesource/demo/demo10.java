package com.apesource.demo;

public class demo10 {
	public static void main(String[] args) {
		
		/**
		 * 数组下标越界异常：ArrayIndexOutOfBoundsException
		 * 产生原因：试图通过一个超出范围的下标，去访问数组中不存在的元素
		 */
		String[] city = {"西安市","渭南","咸阳","宝鸡","汉中"};
		System.out.println(city[0]);
		System.out.println(city[1]);//正常下标
		System.out.println(city[6]);//错误下标
		
	}
}
