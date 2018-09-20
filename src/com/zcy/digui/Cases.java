package com.zcy.digui;

import org.junit.Test;

public class Cases {

	/**
	 * 在n个球中，任意取出m个（不放回），求有多少种不同取法
	 * @param n
	 * @param m
	 * @return
	 */
	public static int numbers(int n, int m)
	{
		//函数出口
		if(n<m) return 0;
		if(n==m) return 1;
		if(m==0) return 1;
		//全解，假设有一个特殊的球，拿这个球或者不拿这个球
		return numbers(n-1, m-1)+numbers(n-1, m);
	}
	/**
	 * 求n个元素的全排列
	 * @param data
	 * @param index
	 */
	public static void all(char[] data, int index)
	{
		//打印
		if(index==data.length)
		{
			for(int i=0; i<data.length; i++)
			{
				System.out.print(data[i]);
			}
			System.out.println();
		}
		
		for(int i=index; i<data.length; i++)
		{
			//先确定第一个元素的全排列
			{char t = data[index]; data[index] = data[i]; data[i] = t;}//试探
			//剩余元素的全排列
			all(data, index+1);
			//确定下一个元素的全排列
			{char t = data[index]; data[index] = data[i]; data[i] = t;}//回溯
		}
	}

	/**
	 * 求两个字符串的最长公共子序列
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static int maxSubstring(String s1, String s2)
	{
		if(s1.length()==0 || s2.length()==0) return 0;
		if(s1.charAt(0) == s2.charAt(0))
		{
			return maxSubstring(s1.substring(1), s2.substring(1))+1;
		}
		else
		{
			return Math.max(maxSubstring(s1, s2.substring(1)), maxSubstring(s1.substring(1), s2));
		}
	}
	/**
	 * 求字符串的逆
	 * @param s
	 * @return 
	 */
	public static String nixu(String s)
	{
		if(s==null || s.length()<2) return s;
		return nixu(s.substring(1)) + s.charAt(0);
	}

	/**
	 * 杨辉三角
	 * @param m
	 * @param n
	 * @return
	 */
	public static int trigle(int m, int n)
	{
		if(m==0) return 1;
		if(n==0 || n==m) return 1;
		return trigle(m-1, n-1) + trigle(m-1, n);
	}
	/**
	 * m个A，n个B可以组成多少个不同排列
	 * @param m
	 * @param n
	 * @return
	 */
	public static int pailie(int m, int n)
	{
		if(m==0 || n==0) return 1;
		//全排列，第一个字母是A，第一个字母不是A
		return pailie(m-1, n) + pailie(m, n-1);
	}
	/**
	 * 对n进行加法划分
	 * @param number 要求的数字
	 * @param arr 缓冲数组，打印所需
	 * @param k 当前的位置
	 */
	public void huafen(int number, int[] arr, int k)
	{
		if(number<=0)
		{
			for(int i=0; i<k; i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			return;
		}
		/*
		 * 6
		 * 5...f(1)
		 * 4...f(2)
		 */
		for(int i=number; i>0; i--)
		{
			//如果后一项大于前一项，直接进入下次循环
			if(k>0 && i > arr[k-1]) continue;
			arr[k] = i;
			huafen(number-i, arr, k+1);
		}
	}
	
	@Test
	public void testStr()
	{
		int[] arr = new int[100];
		huafen(6, arr, 0);
	}
}
