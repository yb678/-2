package com.apesource.demo;

public class demo15 {
	public static void main(String[] args) {
		try {
			System.out.println("try�鿪ʼ");
			System.out.println("1.��ȷ�����");
			System.out.println("2.��ȷ�����");
			System.out.println("3.��ȷ�����");
			String str = null;
			int number = str.length();
			System.out.println("4.��ȷ�����");
			System.out.println("5.��ȷ�����");
			System.out.println("6.��ȷ�����");
			System.out.println("7.��ȷ�����");
			System.out.println("try�����");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("catch��");
			throw e;//�׳��쳣����֮�󣬺���Ĵ���鲻ִ��
		}finally {
			//�����Ƿ��쳣�����ᱻִ�еĴ���
			System.out.println("TNE END");
		}
	}
}
