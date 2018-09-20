package com.pat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//输出按字典序排列的字符串
public class SortString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();//光标不会换行
		in.nextLine();//吸收换行符
		List<String> list = new ArrayList<>();
		for(int i=0; i<num; i++)
		{
			list.add(in.nextLine());
		}
		Collections.sort(list);
		list.forEach(item -> System.out.println(item));
	}
}
