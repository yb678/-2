package com.apesource.demo;

public class demo15 {
	public static void main(String[] args) {
		try {
			System.out.println("try块开始");
			System.out.println("1.正确代码块");
			System.out.println("2.正确代码块");
			System.out.println("3.正确代码块");
			String str = null;
			int number = str.length();
			System.out.println("4.正确代码块");
			System.out.println("5.正确代码块");
			System.out.println("6.正确代码块");
			System.out.println("7.正确代码块");
			System.out.println("try块结束");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("catch块");
			throw e;//抛出异常对象之后，后面的代码块不执行
		}finally {
			//无论是否异常，都会被执行的代码
			System.out.println("TNE END");
		}
	}
}
