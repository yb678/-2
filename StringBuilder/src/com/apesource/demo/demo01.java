package com.apesource.demo;

public class demo01 {
	public static void main(String[] args) {
		/**
		 * StringBuilder:
		 * 1.��һ���ɱ���ַ�������
		 * 2.�����ַ������޸ģ��ǶԵ�ǰ�ַ��������ݵ��޸�
		 */
		String str = "ABC";
		str = str + "xyz";//ƴ�Ӻ�������ַ�����������±�����str
		
		//�滻����
		str = str.replaceAll("xyz", "���ұ�");
		System.out.println("String = "+str);
		
		StringBuilder sb = new StringBuilder("ABC");
		sb.append("xyz");//��StringBuilderԭ�������ݺ��棬׷���µ��ַ���
		
		//�滻����
		sb.replace(3, 6, "���ұ�");
		System.out.println("StringBuilder = "+sb);
	}
}
