package com.apesource.demo;

public class demo03 {
	public static void main(String[] args) {
		//StringBuilder的删除操作
		/**
		 * 1.对字符串进行删除操作
		 * 2.Start:指定删除的开始位置
		 * 3.end：指定删除的结束位置（不包含）
		 */
		StringBuilder sb = new StringBuilder("大漠孤烟直");
		sb.delete(2, 4);
		System.out.println(sb);
	}
}
