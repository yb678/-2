package com.apesource.demo;

import java.util.Arrays;
import java.util.Random;
	/*
	 * 	题目描述：请按照代码思路，完成扑克牌面的初始化
	         	 
	       		 
	 *	题目来源：远航游戏2015校招笔试题
	 * 	所需知识：数组
	 */
	public class demo06 {
		public static void main(String[] args) {
			String[] colors  = {"♠","♥","♣","♦"};
			String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			
			String[] pokers  = new String[colors.length*numbers.length];
			int index = 0;
			//补充代码，完成扑克牌面的初始化，并且按照  ♠A ♥A ♣A ♦A ♠2 ♥2 ♣2 ♦2......♠K ♥K ♣K ♦K顺序存储
			
			for(int j = 0;j<numbers.length;j++) {
				for(int i = 0;i<colors.length;i++) {
					pokers[index++] = colors[i]+numbers[j];
				}
			}
			System.out.println("扑克牌面：" + Arrays.toString(pokers));
			//补充代码完成随机洗牌
			Random ran = new Random();
			
			for(int i = pokers.length - 1;i>0;i--) {
				int pokerindex = ran.nextInt(i);
				String temp = pokers[i];
				pokers[i] = pokers[pokerindex];
				pokers[pokerindex] = temp;
			}
			
			System.out.println("洗牌后："+Arrays.toString(pokers));
		}
	}


