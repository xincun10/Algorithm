package com.zcy;
/*
 * �ַ���λ
 * ��һ���ַ����Ĵ�д��ĸ�ŵ��ַ����ĺ��棬
 * �����ַ������λ�ò��䣬�Ҳ����������Ŀռ䡣
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
