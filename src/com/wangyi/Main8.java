package com.wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int heaps = in.nextInt();
		int[] apples = new int[heaps];
		int[] sums = new int[heaps];
		int tmp = 0;
		for(int i=0; i<heaps; i++)
		{
			apples[i] = in.nextInt();
		}
		for(int i=0; i<heaps; i++)
		{
			tmp += apples[i];
			sums[i] = tmp;
		}
		int asks = in.nextInt();
		int[] ques = new int[asks];
		int[] ans = new int[asks];
		for(int i=0; i<asks; i++)
		{
			ques[i] = in.nextInt();
		}
		for(int i=0; i<asks; i++)
		{
			ans[i] = Arrays.binarySearch(sums, ques[i]);
		}
		for(int a:ans)
		{
			if(a<0)
				System.out.println(-a);
			else
				System.out.println(a+1);
		}
	}

}
