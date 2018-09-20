package com.aqiyi;

import java.util.Scanner;

/*
 * 回文素数
 * 如果一个整数只能被1和自己整除,就称这个数是素数。
 * 如果一个数正着反着都是一样,就称为这个数是回文数。例如:6, 66, 606, 6666
 * 如果一个数字既是素数也是回文数,就称这个数是回文素数
 * 牛牛现在给定一个区间[L, R],希望你能求出在这个区间内有多少个回文素数。
 */
public class HuiwenSushu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int low = scan.nextInt();
			int high = scan.nextInt();
			int number = 0;
			while(low<=high)
			{
				if(isPrime(low) && isHuiwen(low))
				{
					number++;
				}
				low++;
			}
			System.out.println(number);
		}
	}

	//判断一个数是不是素数
	public static boolean isPrime(int num)
	{
		if(num==1 || num==2)
			return false;
		for(int i=2; i<num/2; i++)
		{
			if(num%i == 0)
				return false;
		}
		return true;
	}
	//判断一个数是不是回文数
	public static boolean isHuiwen(int num)
	{
		String str = String.valueOf(num);
		for(int i=0; i<str.length()/2; i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		}
		return true;
	}
}
