package com.mytest;

import java.util.Random;
import java.util.TreeSet;


public class CVTE1 {

	private TreeSet<String> set = new TreeSet<>();
	
	public void generate()
	{
		Random r = new Random();
		StringBuilder sb = null;
		char[] chars = new char[62];
		for(int i=0; i<62; i++)
		{
			if(i < 10)
				chars[i] = (char) ('0' + i);
			else if(i>=10 && i<36)
				chars[i] = (char) ('a' + (i-10));
			else
				chars[i] = (char) ('A' + (i-36));
		}
		do
		{
			sb = new StringBuilder(4);
			for(int i=0; i<4; i++)
			{
				int tmp = r.nextInt(62);
				sb.append(chars[tmp]);
			}
		}while(set.contains(sb.toString()));
		set.add(sb.toString());
		System.out.println(set);
	}
	
	public long getTotal()
	{
		return set.size();
	}
}
