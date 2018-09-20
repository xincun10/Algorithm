package com.xiecheng;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			int m = scan.nextInt();
			double x = n;
			double count = 0;
			for(int i=0; i<m; i++)
			{				
				count += x;
				x = Math.sqrt(x);
			}
			System.out.printf("%.2f", count);
			System.out.println();
		}
	}
}
