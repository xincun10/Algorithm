package com.xiecheng;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++)
			{
				arr[i] = scan.nextInt();
			}
			reOrder(arr);
			for(int i:arr)
			{
				System.out.println(i);
			}
		}
	}
	public static void reOrder(int[] arr) {
		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n && count < n; i++) {
			count++;
			int m = arr[i];
			if (arr[i] == 0) {
				for (int j = i; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[n - 1] = m;
				i--;
			}
		}
	}
}
