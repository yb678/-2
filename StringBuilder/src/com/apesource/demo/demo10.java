package com.apesource.demo;

public class demo10 {
	public static void main(String[] args) {
		
		/**
		 * �����±�Խ���쳣��ArrayIndexOutOfBoundsException
		 * ����ԭ����ͼͨ��һ��������Χ���±꣬ȥ���������в����ڵ�Ԫ��
		 */
		String[] city = {"������","μ��","����","����","����"};
		System.out.println(city[0]);
		System.out.println(city[1]);//�����±�
		System.out.println(city[6]);//�����±�
		
	}
}
