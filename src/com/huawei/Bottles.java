package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bottles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		while(in.hasNext())
		{
			int empty = in.nextInt();
			int res = getDrink(empty);
			list.add(res);
		}
		list.forEach(item -> System.out.println(item));
	}

	private static int getDrink(int empty) {
		int sum = 0;
		while(empty > 2)
		{
			int newEmpty = empty/3;
			sum += newEmpty;
			empty = empty%3 + newEmpty;
			if(empty == 2)
			{
				sum++;
				empty = 0;
			}
		}
		return sum;
	}
}
