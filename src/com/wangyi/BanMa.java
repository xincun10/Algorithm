package com.wangyi;

public class BanMa {
	public static void main(String[] args) {
		
	}
	
	public static int Calc(char[] chars)
	{
		int nums = chars.length;
		int len[] = new int[nums];
		len[0] = 1;
		for(int i=1; i<nums; i++)
		{
			if(chars[i] != chars[i-1])
			{
				len[i] = len[i-1] + 1;
			}
			else
			{
				len[i] = len[i-1];
			}
		}
		return len[nums-1];
	}
}
