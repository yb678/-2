package com.apesource.demo;

public class demo04 {
	public static void main(String[] args) {
		//�������
		StringBuilder sb = new StringBuilder("ů����ӭ�ҷ�����˭�ҵ�");
		/**
		 * 1.StringBuilder��insert����ִ�в������
		 * 2.sb.insert(int offset,str):
		 * offset:ָ������λ�õ��±�
		 * str:ָ��Ҫ������ַ���
		 * 3.�����Բ����ַ�����
		 */
		sb.insert(3, "��");
		char[] chs = {'��','��','��'};
		sb.insert(8,chs);
		System.out.println(sb);
	}
}
