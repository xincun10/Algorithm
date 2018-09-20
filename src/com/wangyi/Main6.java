package com.wangyi;

import java.util.Scanner;

/*
 * 迷路的牛牛
 */
public class Main6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int steps = 0;
			int n = scan.nextInt();
			String str = scan.next();
			for(int i=0; i<n; i++)
			{
				if(str.charAt(i)=='L')
				{
					steps += 3;
				}
				else if(str.charAt(i)=='R')
				{
					steps++;
				}
			}
			String res = "NESW";
			System.out.println(res.charAt(steps%4));
		}
	}
}
