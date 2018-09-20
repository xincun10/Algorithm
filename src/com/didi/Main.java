package com.didi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] strs = s.split(" ");
		int[] score = new int[strs.length];
		score[0] = 0;
		//计算得分
		for(int i=1; i<strs.length; i++)
		{
			score[i] = scores(strs[i], strs[0]);
		}
		int[] tmp = new int[score.length];
		System.arraycopy(score, 0, tmp, 0, score.length);
		Arrays.sort(score);
		int n = 0;
		while(n<3)
		{
			for(int i=1; i<score.length; i++)
			{
				if(tmp[i] == score[n])
				{
					list.add(strs[i]);
					n++;
					if(n>=3)
					{
						break;
					}
				}
			}
			
		}
		for(String str:list)
		{
			System.out.print(str+" ");
		}
	}

	private static int scores(String s, String source) {
		String str1 = "qwertasdfgzxcv";
		String str2 = "yuiophjklbnm";
		int res = 0;
		if(s.length() == source.length())
		{
			for(int i=0; i<s.length(); i++)
			{
				char c1 = s.charAt(i);
				char c2 = source.charAt(i);
				if(c1 != c2)
				{
					if((str1.indexOf(c1)>=0 && str1.indexOf(c2)>=0)
							|| (str2.indexOf(c1)>=0 && str2.indexOf(c2)>=0))
					{
						res += 1;
					}
					else
					{
						res += 2;
					}
				}
			}
		}
		else if(s.length() > source.length())
		{
			String ss = "";
			for(int i=0; i<source.length(); i++)
			{
				char c1 = s.charAt(i);
				char c2 = source.charAt(i);
				if(c1 != c2)
				{
					ss = s.substring(0, i)+s.substring(i+1);
				}
				return scores(ss, source)+3;
			}
			ss = s.substring(0, source.length());
			return scores(ss, source)+3;
		}
		else
		{
			String ss = "";
			for(int i=0; i<s.length(); i++)
			{
				char c1 = s.charAt(i);
				char c2 = source.charAt(i);
				if(c1 != c2)
				{
					ss = s.substring(0, i)+c2+s.substring(i);
				}
				return scores(ss, source)+3;
			}
			ss = s + source.substring(s.length());
			return scores(ss, source)+3;
		}
		return res;
	}
}
