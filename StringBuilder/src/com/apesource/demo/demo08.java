package com.apesource.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo08 {
	public static void main(String[] args) {

		/**
		 * 算数逻辑异常：ArithmeticException 
		 * 产生原因：出现数学计算的逻辑问题或错误（例如，除数为0）
		 * 输入不匹配异常：InputMismatchException 
		 * 产生原因：输入的内容与要求的类型不匹配
		 * 例如：（nextInt要求输入整数，而我们输入abc则是不行的）
		 */
		Scanner input = new Scanner(System.in);
		
		int result = 0;
		//一个try块可以匹配多个catch块
		//快捷键：Alt+Shift+z
		try {
			// 计算除法运算（判断可能会产生异常的代码）
			int number3 = Integer.parseInt("shsh876566");
			System.out.println("请输入第一个数字");
			int number1 = input.nextInt();
			System.out.println("请输入第二个数字");
			int number2 = input.nextInt();
			result = number1 / number2;
			System.out.printf("%d ÷ %d = %d", number1, number2, result);
		} catch(InputMismatchException im) {
			System.err.println("出错啦，应该是数字哦");
			im.printStackTrace();
			
		}catch (ArithmeticException ae) {
			System.err.println("除数不能为0");// 自定义的异常提示内容
			System.err.println(ae.getMessage());// 提取自系统的异常提示内容

			// 打印系统的异常堆栈信息
			ae.printStackTrace();
		}catch(Exception e) {
			//Exception代表通用的异常类型，没有特指某一种异常类型
			//往往出现在多个catch块中的最后一个
			System.out.println("demo08出错啦");
			e.printStackTrace();
		}
	
	}
}
