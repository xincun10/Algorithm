package com.safe;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		String[] childs = str1.split(" ");
		String[] candys = str2.split(" ");
		int[] child = new int[childs.length];
		for(int i=0; i<childs.length; i++)
		{
			child[i] = Integer.parseInt(childs[i]);
		}
		int[] candy = new int[candys.length];
		for(int i=0; i<candys.length; i++)
		{
			candy[i] = Integer.parseInt(candys[i]);
		}
		Arrays.sort(child);
		Arrays.sort(candy);
		int index = 0;
		int res = 0;
		for(int i=0; i<candy.length; i++)
		{
			if(candy[i]>=child[index])
			{
				res++;
				index++;
			}
			if(index >= child.length)
				break;
		}
		System.out.println(res);
	}
}
