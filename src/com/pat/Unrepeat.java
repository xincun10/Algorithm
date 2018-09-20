package com.pat;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * ���ز������ظ����ֵ�����
 */
public class Unrepeat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//���ַ�������
		StringBuffer s = new StringBuffer(in.nextLine()).reverse();
		char[] arr = s.toString().toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		String str = "";
		for(char c:arr)
		{
			if(set.add(c))
			{
				str += c;
			}
		}
		System.out.println(str);
	}
}
