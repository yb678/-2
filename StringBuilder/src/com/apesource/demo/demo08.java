package com.apesource.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo08 {
	public static void main(String[] args) {

		/**
		 * �����߼��쳣��ArithmeticException 
		 * ����ԭ�򣺳�����ѧ������߼������������磬����Ϊ0��
		 * ���벻ƥ���쳣��InputMismatchException 
		 * ����ԭ�������������Ҫ������Ͳ�ƥ��
		 * ���磺��nextIntҪ����������������������abc���ǲ��еģ�
		 */
		Scanner input = new Scanner(System.in);
		
		int result = 0;
		//һ��try�����ƥ����catch��
		//��ݼ���Alt+Shift+z
		try {
			// ����������㣨�жϿ��ܻ�����쳣�Ĵ��룩
			int number3 = Integer.parseInt("shsh876566");
			System.out.println("�������һ������");
			int number1 = input.nextInt();
			System.out.println("������ڶ�������");
			int number2 = input.nextInt();
			result = number1 / number2;
			System.out.printf("%d �� %d = %d", number1, number2, result);
		} catch(InputMismatchException im) {
			System.err.println("��������Ӧ��������Ŷ");
			im.printStackTrace();
			
		}catch (ArithmeticException ae) {
			System.err.println("��������Ϊ0");// �Զ�����쳣��ʾ����
			System.err.println(ae.getMessage());// ��ȡ��ϵͳ���쳣��ʾ����

			// ��ӡϵͳ���쳣��ջ��Ϣ
			ae.printStackTrace();
		}catch(Exception e) {
			//Exception����ͨ�õ��쳣���ͣ�û����ָĳһ���쳣����
			//���������ڶ��catch���е����һ��
			System.out.println("demo08������");
			e.printStackTrace();
		}
	
	}
}
