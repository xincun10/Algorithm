package com.pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitString {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		String[] results1 = handle(str1);
		for(int i=0; i<results1.length; i++)
		{
			System.out.println(results1[i]);
		}
		String[] results2 = handle(str2);
		for(int i=0; i<results2.length; i++)
		{
			System.out.println(results2[i]);
		}
	}

	public static String[] handle(String str)
	{
//		String[] result = new String[] {};//如此定义相当于创建了一个长度为0的String(字符串)型的一维数组。在后期为其赋值的时候str[0]="A"，就会抛出异常
		List<String> result = new ArrayList<>();
		int len = (str.length())/8;
		int last = str.length()%8;
		for(int i=0; i<len; i++)
		{
			result.add(str.substring(i*8, (i+1)*8));
		}
		if(last != 0)
		{
			while(last<8)
			{
				str = str+"0";
				last++;
			}
			result.add(str.substring(len*8));
		}
		String[] results = result.toArray(new String[result.size()]);
		return results;
	}
	
	//效率高
	public static void split(String s) {
		while (s.length() >= 8) {
			System.out.println(s.substring(0, 8));
			s = s.substring(8);
		}
		if (s.length() < 8 && s.length() > 0) {
			s = s + "00000000";
			System.out.println(s.substring(0, 8));
		}
	}
	
}
