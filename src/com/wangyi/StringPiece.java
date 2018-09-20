package com.wangyi;

import java.util.Scanner;

public class StringPiece {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count = 0;
		double sum = 0;
		while(str.length()>0)
		{
			int piece = 1;
			while(str.length()>1 && str.charAt(0)==str.charAt(1))
			{
				str = str.substring(1);
				piece++;
			}
			sum += piece;
			count++;
			str = str.substring(1);
		}
		double res = sum / count;
		System.out.printf("%.2f", res);
	}
}
