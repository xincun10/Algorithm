package com.wangyi;

import java.util.Scanner;

public class Neibor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int n, k;
		int res[][] = new int[num][2];
		for(int i=0; i<num; i++)
		{
			n = in.nextInt();
			k = in.nextInt();
			res[i][0] = 0;
			res[i][1] = MaxCount(n, k);
		}
		for(int i=0; i<num; i++)
		{
			System.out.println(res[i][0] + " " + res[i][1]);
		}
	}
	
	public static int MaxCount(int n, int k)
	{
		if((k == 0)||(n == 0))
			return 0;
		if(n == k)
			return 0;
		if(n >= k*2-1)
			return k-1;
		else
			return n-k;
	}

}
