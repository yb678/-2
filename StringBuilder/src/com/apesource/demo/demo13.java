package com.apesource.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo13 {
	public static void main(String[] args) {
		
		/**
		 * 非法的参数异常：IllegalArgumentException
		 * 产生原因：调用对象的某种方法时，传入了非法的参数
		 */
		Date now = new Date();
		System.out.println("默认格式："+now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		//对对象now进行格式化处理
	//	String current = sdf.format(now);//正确处理
		String current = sdf.format("2020-02-09");//异常处理
		System.out.println("格式化处理:"+current);
	}
}
