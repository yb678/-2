package com.apesource.demo;

public class demo12 {
	public static void main(String[] args) {
		/**
		 * ���ָ�ʽ���쳣:NumberFormatException
		 *����ԭ�� ��һ���Ƿ����ַ����������˷��������ݵ��ַ�����������ת��ʱ��
		 *        �����NumberFormatException
		 */
		String totalStr = ":3243";
		int total = Integer.parseInt(totalStr);
		double result = total * 0.4;
		System.out.println(result);
	}
}
