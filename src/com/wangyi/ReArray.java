package com.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		List<String> list = new ArrayList<>();
		for(int i=0; i<num; i++)
		{
			int sz = in.nextInt();
			int[] arr = new int[sz];
			for(int j=0; j<sz; j++)
			{
				arr[j] = in.nextInt();
			}
			list.add(isSatisfy(arr));
		}
		list.forEach(item -> System.out.println(item));
	}
	
	//ÅÐ¶ÏÊÇ·ñÂú×ãÒªÇó
	private static String isSatisfy(int[] arr)
	{
		int power = arr.length / 3 + 1;
		long mul = (long) Math.pow(4, power);
		long mulAll = 1;
		for(int i=0; i<arr.length; i++)
		{
			mulAll *= arr[i];
		}
		if(mulAll%mul == 0)
		{
			return "Yes";
		}
		else
		{
			return "No";
		}
	}
}

