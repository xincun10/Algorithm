package com.offer;
/*
 * 二进制中1的个数
 */
public class NumberOf1 {
	public int NumberOf1(int n) {
		String result = Integer.toBinaryString(n);
		int count = 0;
		for(int i=0; i<result.length(); i++)
		{
			if(result.charAt(i)=='1')
				count++;
		}
		return count;
    }
}
