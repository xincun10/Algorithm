package com.aqiyi;

import java.util.Scanner;

public class ID {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] arr = str.toCharArray();
		char[] arr1 = str.substring(0, 3).toCharArray();
		char[] arr2 = str.substring(3).toCharArray();
		int res;
		int front = arr[0]+arr[1]+arr[2];
		int back = arr[3]+arr[4]+arr[5];
		if(front == back)
		{
			res = 0;
		}
		else if(Math.abs(front-back) < 9)
		{
			res = 1;
		}
		else if(Math.abs(front-back) < 18)
		{
			res = 2;
		}
		else
		{
			res = 3;
		}
		if((front-back == -9 && (Numbers(arr1, '0')>0 || Numbers(arr2, '9')>0))
				|| (front-back == -18 && (Numbers(arr1, '0')>1 || Numbers(arr2, '9')>1))
				|| (front-back == 9 && (Numbers(arr2, '0')>0 || Numbers(arr1, '9')>0))
				|| (front-back == 18 && (Numbers(arr2, '0')>1 || Numbers(arr1, '9')>1))
				)
		{
			res--;
		}
		
		System.out.println(res);
	}
	
	private static int Numbers(char[] arr, char a)
	{
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == a)
				count++;
		}
		return count;
	}

}
