package com.mytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		//存放无用函数
		Set<Integer> set = new TreeSet<>();
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i=0; i<n; i++)
		{
			arr[i] = in.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			Integer key = in.nextInt();
			List<Integer> list = new ArrayList<>();
			set.add(key);
			for(int j=0; j<arr[i]; j++)
			{
				int m = in.nextInt();
				list.add(m);
				set.add(m);
			}
			map.put(key, list);
		}
		
		List<Integer> result = new ArrayList<>();
		List<Integer> list = map.get(0);
		result.add(0);
		result.addAll(list);
		set.remove(0);
		for(int i=0; i<list.size(); i++)
		{
			List tmp = map.get(list.get(i));
			if(tmp!=null)
				result.addAll(tmp);
		}
		
		for(Integer i:result)
		{
			set.remove(i);
		}
		if(set.isEmpty())
			System.out.println("NA");
		else
			set.forEach(item->System.out.println(item));
		
	}

	
}
