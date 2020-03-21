package com.apesource.demo;

public class demo04 {
	public static void main(String[] args) {
		//插入操作
		StringBuilder sb = new StringBuilder("暖阳下迎芬芳，是谁家的");
		/**
		 * 1.StringBuilder的insert方法执行插入操作
		 * 2.sb.insert(int offset,str):
		 * offset:指定插入位置的下标
		 * str:指定要插入的字符串
		 * 3.还可以插入字符数组
		 */
		sb.insert(3, "我");
		char[] chs = {'你','我','他'};
		sb.insert(8,chs);
		System.out.println(sb);
	}
}
