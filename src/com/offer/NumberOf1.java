package com.offer;
/*
 * ��������1�ĸ���
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
