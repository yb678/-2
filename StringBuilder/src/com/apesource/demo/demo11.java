package com.apesource.demo;

public class demo11 {
	public static void main(String[] args) {
		/**
		 * �ַ����±�Խ���쳣��StringIndexOutOfBoundsException
		 * ����ԭ����ͼ��һ�������ڵ��±꣬ȥ�����ַ�����ĳһλ��
		 */
		String str = "���Ȼ��Ů����";
		String result1 = str.substring(0,3);
		
		String result2 = str.substring(4,8);
		System.out.println(result1);
		System.out.println(result2);
	}
}
