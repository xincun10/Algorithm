package com.test.baidu;

import java.util.Scanner;
/**
 * 一个数轴上共有N个点，第一个点的坐标是度度熊现在位置，第N-1个点是度度熊的家。
 * 现在他需要依次的从0号坐标走到N-1号坐标。
 * 但是除了0号坐标和N-1号坐标，他可以在其余的N-2个坐标中选出一个点，
 * 并直接将这个点忽略掉，问度度熊回家至少走多少距离？
 * @author Administrator
 *
 */
public class Main2 {

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
			int index = 0;
			int dis = 0;
			int sum = 0;
			for(int i=1; i<n-1; i++)
			{
				int tmp = Math.abs(arr[i]-arr[i-1])+Math.abs(arr[i]-arr[i+1]);
				sum += Math.abs(arr[i]-arr[i-1]);
				tmp = tmp-Math.abs(arr[i+1]-arr[i-1]);
				if(tmp>dis)
				{
					dis = tmp;
					index = i;
				}
			}
			sum += Math.abs(arr[n-1]-arr[n-2]);
			System.out.println(sum-dis);
			
		}
	}
}
