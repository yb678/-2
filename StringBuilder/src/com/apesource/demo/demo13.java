package com.apesource.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo13 {
	public static void main(String[] args) {
		
		/**
		 * �Ƿ��Ĳ����쳣��IllegalArgumentException
		 * ����ԭ�򣺵��ö����ĳ�ַ���ʱ�������˷Ƿ��Ĳ���
		 */
		Date now = new Date();
		System.out.println("Ĭ�ϸ�ʽ��"+now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		//�Զ���now���и�ʽ������
	//	String current = sdf.format(now);//��ȷ����
		String current = sdf.format("2020-02-09");//�쳣����
		System.out.println("��ʽ������:"+current);
	}
}
