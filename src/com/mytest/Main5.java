package com.mytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<int[]> list = new ArrayList<>();
		int num = in.nextInt();
		double[] avgs = new double[num];
		for(int i=0; i<num; i++)
		{
			int len = in.nextInt();
			int[] arr = new int[len];
			int sum = 0;
			for(int j=0; j<len; j++)
			{
				arr[j] = in.nextInt();
				sum += arr[j];
			}
			Arrays.sort(arr);
			avgs[i] = (double)sum/len;
			list.add(arr);
		}
		List<Integer> results = new ArrayList<>();
		for(int[] arrs:list)
		{
			for(int i=0; i<arrs.length; i++)
			{
				if(arrs[i] >= avgs[i])
				{
					results.add(arrs.length-i);
					break;
				}
			}
		}
		results.forEach(item -> System.out.println(item));
	}
}
