package com.apesource.demo;

public class demo03 {
	public static void main(String[] args) {
		//StringBuilder��ɾ������
		/**
		 * 1.���ַ�������ɾ������
		 * 2.Start:ָ��ɾ���Ŀ�ʼλ��
		 * 3.end��ָ��ɾ���Ľ���λ�ã���������
		 */
		StringBuilder sb = new StringBuilder("��Į����ֱ");
		sb.delete(2, 4);
		System.out.println(sb);
	}
}
