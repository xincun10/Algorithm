package com.aqiyi;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 排序
 * 牛牛有一个长度为n的整数序列,牛牛想对这个序列进行重排为一个非严格升序序列。
 * 牛牛比较懒惰,他想移动尽量少的数就完成重排,请你帮他计算一下他最少需要移动多少个序列中的元素。
 * (当一个元素不在它原来所在的位置,这个元素就是被移动了的) 
 * 
 * 尝试使用最长有序子字符串解，但是没有通过全部case，
 * 元素移动的定义？不明觉厉
 */
public class Paixu {

	//正确解法，排序完之后给原来的数组比较，只要位置不一样，就代表移动了
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int num = scan.nextInt();
			int[] arr = new int[num];
			int[] flag = new int[num];
			for(int i=0; i<num; i++)
			{
				int tmp = scan.nextInt();
				arr[i] = tmp;
				flag[i] = tmp;
			}
			Arrays.sort(arr);
			int count = 0;
			for(int i=0; i<num; i++)
			{
				if(arr[i]!=flag[i])
					count++;
			}
			System.out.println(count);
		}
	}
	//最长子字符串，不对
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int num = scan.nextInt();
			int[] arr = new int[num];
			int[] flag = new int[num];
			for(int i=0; i<num; i++)
			{
				arr[i] = scan.nextInt();
				flag[i] = 1;
			}
			int max = 1;
			for(int i=1; i<num; i++)
			{
				for(int j=0; j<i; j++)
				{
					if(arr[j]<=arr[i] && flag[j]+1>flag[i])
					{
						flag[i] = flag[j] + 1;
						if(max<flag[i])
						{
							max = flag[i];
						}
					}
				}
			}
			System.out.println(num - max);
		}
	}
}
