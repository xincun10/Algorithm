package com.pat;

import java.util.Scanner;

/*
 * 十六进制转换为十进制
 */
public class ChangeJinzhi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String str = in.nextLine().substring(2);
			System.out.println(exchange(str));
		}
	}

	public static int exchange(String str) {
		int count = 0;
		int sum = 0;
		int num = 0;
		while (count < str.length()) {
			char tmp = str.charAt(str.length() - count - 1);
			if (tmp >= '0' && tmp <= '9') {
				num = tmp - '0';
			} else if (tmp >= 'A' && tmp <= 'Z') {
				num = tmp - 'A' + 10;
			} else if (tmp >= 'a' && tmp <= 'z') {
				num = tmp - 'a' + 10;
			} else {
				break;
			}
			sum += num*Math.pow(16, count);
			count++;
		}
		return sum;
	}
}
