package com.wangyi;

import java.util.Scanner;

public class OppositeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer str = new StringBuffer(in.nextLine());
		System.out.println(getOpppsite(str));
	}

	private static int getOpppsite(StringBuffer str) {
		int num1 = Integer.parseInt(str.toString());
		String rev = str.reverse().toString();
		while(rev.charAt(0)=='0')
		{
			rev = rev.substring(1);
		}
		int num2 = Integer.parseInt(rev);
		return (num1+num2);
	}
}
