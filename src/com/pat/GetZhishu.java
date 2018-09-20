package com.pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetZhishu {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		System.out.println(getResult(num));
	}

	public static String getResult(long ulDataInput)
	{
		List<Long> list = new ArrayList<>();
		String str = "";
		long i = 2;
		while(i<ulDataInput/2+1)
		{
			if(ulDataInput%i == 0)
			{
				list.add(i);
				ulDataInput /= i;
				i = 1;
			}
			i++;
		}
		list.add(ulDataInput);
		for(long item:list)
		{
			str += item + " ";
		}
		return str;
	}
}
