package com.mytest;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String str = in.nextLine();
			String[] strs = str.split("\\.");
			String result = "";
			
			for(String s:strs)
			{
				s = s.trim();
				if((!s.equals("")) && s.charAt(0) <= 122 && s.charAt(0) >= 97)
				{
					char c = (char) (s.charAt(0) - 32);
					s = c + s.substring(1) + ". ";
					result += s;
				}
				if(s.equals(""))
				{
					result += ". ";
				}
			}
			System.out.println(result.trim());
		}
	}
}
