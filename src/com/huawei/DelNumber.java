package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DelNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<num; i++)
		{
			list.add(i);
		}
		System.out.println(getLast(list));
	}

	private static int getLast(List<Integer> list)
	{
		int index = 0;
		while(list.size()>1)
		{
			index = (index + 2) % list.size();
			list.remove(index);
		}
		return list.get(0);
	}
}
