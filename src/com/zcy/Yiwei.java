package com.zcy;
/*
 * 字符移位
 * 把一个字符串的大写字母放到字符串的后面，
 * 各个字符的相对位置不变，且不能申请额外的空间。
 */

import java.util.Scanner;

public class Yiwei {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			char[] chars = scan.nextLine().toCharArray();
			
			for(int i=0, j=0; i<chars.length||j<chars.length; i++,j++)
			{
				while(chars[i] >= 'a' && chars[i] <= 'z')
				{
					i++;
				}
				while(chars[j] >= 'A' && chars[j] <= 'Z')
				{
					j++;
				}
				char tmp = chars[i];
				chars[i] = chars[j];
				chars[j] = tmp;
			}
			for(char c:chars)
				System.out.print(c);
		}
	}
}
