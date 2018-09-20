package com.yuanjing;

import java.util.Scanner;

public class Main1 {
	public static final String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	public static final String str2 = "ECFAJKLBDGHIVWZYMNOPQRSTUXerwqtyghbnuiopsjkdlfazxcvm";
	public static final String str3 = "abcdefghijklmnopqrstuvwxyz";
	public static final String str4 = "erwqtyghbnuiopsjkdlfazxcvm";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		while(!str.equals("#"))
		{
			char[] words = str.toCharArray();
			for(int i=0; i<words.length; i++)
			{
				int index;
				if((index = str1.indexOf(words[i]))!=-1)
				{
					words[i] = str2.charAt(index);
				}
			}
			System.out.println(String.valueOf(words));
			str = scan.nextLine();
		}
	}
}
