package com.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 3 3
1 100
10 1000
100000 1001
9 10 100000
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			Work[] works = new Work[n];
			for(int i=0; i<n; i++)
			{
				works[i] = new Work();
				works[i].d = scan.nextInt();
				works[i].p = scan.nextInt();
			}
			int[] peoples = new int[m];
			//对工作按难度排序
			Arrays.sort(works);
			for(int i=0; i<m; i++)
			{
				peoples[i] = scan.nextInt();
			}
			//存储值的数组
			int[] ds = new int[n];
			//如果难度大的薪酬低，直接将前面薪酬高的将其覆盖掉
			for(int i=0; i<n-1; i++)
			{
				if(works[i].p > works[i+1].p)
				{
					works[i+1].p = works[i].p;
				}
				ds[i] = works[i].d;
			}
			ds[n-1] = works[n-1].d;
			//使用Arrays.binarySearch查找是否存在，返回值代表存在的位置或者要插入的位置
			for(int i=0; i<m; i++)
			{
				int index = Arrays.binarySearch(ds, peoples[i]);
				if(index >= 0)//数组中存在这个值
				{
					System.out.println(works[index].p);
				}
				else if(index < -1)//插入索引为-index，从1开始
				{
					System.out.println(works[-index-2].p);
				}
				else
				{
					System.out.println(0);
				}
			}
		}
	}
}

class Work implements Comparable<Work>
{
	int d;//难度
	int p;//报酬

	@Override
	public int compareTo(Work o) {
		// TODO Auto-generated method stub
		return this.d-o.d;
	}
	
}
