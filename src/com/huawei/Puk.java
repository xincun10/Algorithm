package com.huawei;

import java.util.Scanner;

/*
 * ∆ÀøÀ≈∆
 */
public class Puk {
	public static String all = "3456789BJQKA2jokerJOKER";
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = handleTen(str);
		String str1 = str.substring(0, str.indexOf("-"));
		String str2 = str.substring(str.indexOf("-")+1);
		
		String result = "";
		if(str1.indexOf("joker")!=-1 && str1.indexOf("JOKER")!=-1)
		{
			result += str1;
		}
		else if(str2.indexOf("joker")!=-1 && str2.indexOf("JOKER")!=-1)
		{
			result += str2;
		}
		else
		{
			if(str1.length() == str2.length())
			{
				if(all.indexOf(str1.charAt(0)) > all.indexOf(str2.charAt(0)))
				{
					result += str1;
				}
				else
				{
					result += str2;
				}
			}
			else
			{
				if(str1.length()==7)
				{
					result += str1;
				}
				else if(str2.length()==7)
				{
					result += str2;
				}
				else
				{
					System.out.println("ERROR");
					return;
				}
			}
		}
		
		System.out.println(handleTen(result));
	}
	
	//¥¶¿Ì10
	private static String handleTen(String str)
	{
		String result = str;
		if(str.indexOf("10")!=-1)
		{
			result = str.replace("10", "B");
		}
		else if(str.indexOf("B")!=-1)
		{
			result = str.replace("B", "10");
		}
		return result;
	}
}
