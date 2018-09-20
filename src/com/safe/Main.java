package com.safe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int N = in.nextInt();
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		for(int i=0; i<N; i++)
		{
			arr1[i] = in.nextInt();
		}
		for(int i=0; i<N; i++)
		{
			arr2[i] = in.nextInt();
		}
		int[] l = new int[N];
		for(int i=0; i<N; i++)
		{
			l[i] = i;
		}
		int[] r = new int[N];
		for(int i=0; i<N; i++)
		{
			r[i] = i-arr2[i]+1;
		}
		int[] mins = new int[N];
		int[] maxs = new int[N];
		for(int i=0; i<N; i++)
		{
			if(l[i]>r[i])
			{
				maxs[i] = l[i];
				mins[i] = r[i];
			}
			else
			{
				maxs[i] = r[i];
				mins[i] = l[i];
			}
		}
		for(int i=0; i<N; i++)
		{
			int[] myarr = new int[maxs[i]-mins[i]+1];
			System.arraycopy(arr1, mins[i], myarr, 0, maxs[i]-mins[i]+1);
			Arrays.sort(myarr);
			list.add(myarr[0]*myarr[maxs[i]-mins[i]]);
		}
		for(Integer i:list)
		{
			System.out.println(i);
		}
	}
}
