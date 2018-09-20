package com.safe;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(f(n));
	}
	
	public static int f(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return f(n-1) + f(n-2);
	}
}
