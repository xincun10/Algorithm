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
//		String[] result = new String[] {};//��˶����൱�ڴ�����һ������Ϊ0��String(�ַ���)�͵�һά���顣�ں���Ϊ�丳ֵ��ʱ��str[0]="A"���ͻ��׳��쳣
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
	
	//Ч�ʸ�
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
