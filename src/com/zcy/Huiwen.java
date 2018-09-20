package com.zcy;

import java.util.Scanner;

/*
 * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。
 * 如何删除才能使得回文串最长呢？
 * 输出需要删除的字符个数。
 */
public class Huiwen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			//反转得到的字符串，结果转化为求最长公共字符串长度
			String str = in.nextLine();
			String strRev = new StringBuilder(str).reverse().toString();
			int lens[][] = getLCS(str, strRev);
			int leng = str.length();
			System.out.println(leng - lens[leng][leng]);
		}
	}

	public static int[][] getLCS(String str1, String str2)
	{
		int leng1 = str1.length();
		int leng2 = str2.length();
		int[][] lens = new int[leng1+1][leng2+1];
		
		for(int i=0; i<=leng1; i++)
		{
			for(int j=0; j<=leng2; j++)
			{
				if(i==0 || j==0)
				{
					lens[i][j] = 0;
				}
				else if(str1.charAt(i-1) == str2.charAt(j-1))
				{
					lens[i][j] = lens[i-1][j-1] + 1;
				}
				else
				{
					lens[i][j] = Math.max(lens[i][j-1], lens[i-1][j]);
				}
			}
		}
		
		return lens;
	}
}