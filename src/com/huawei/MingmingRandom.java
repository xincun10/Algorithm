package com.huawei;

import java.util.Scanner;
import java.util.TreeSet;

public class MingmingRandom {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<>();
		while(in.hasNext())
		{
			int num = in.nextInt();
			for(int i=0; i<num; i++)
			{
				set.add(in.nextInt());
			}
		}
		
		set.forEach(item -> System.out.println(item));
	}
}
