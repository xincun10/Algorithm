package com.toutiao;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			if(n%2 == 1)
			{
				System.out.println(n-1);
			}
			else
			{
				int tmp = (int) log(n, 2);
				if(Math.pow(2, tmp)==n)
				{
					System.out.println(tmp);
				}
				else if(Math.pow(2, tmp)+Math.pow(2, tmp-1) == n)
				{
					System.out.println(tmp+1);
				}
//				else if(Math.pow(2, tmp)+Math.pow(2, tmp-1) > n)
				else
				{
					int temp = n-(int)Math.pow(2, tmp-1);
					temp = temp/((int)Math.pow(2, tmp-2));
					System.out.println(temp+tmp-1);
				}
			}
		}
	}
	public static double log(double value, double base) {
		return Math.log(value) / Math.log(base);
	}
}
