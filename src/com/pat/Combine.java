package com.pat;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Combine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Integer, Integer> map = new TreeMap<>();
		int num = in.nextInt();
		for(int i=0; i<num; i++)
		{
			int key = in.nextInt();
			if(map.containsKey(key))
			{
				int tmp = map.get(key);
				map.put(key, tmp+in.nextInt());
			}
			else
			{
				map.put(key, in.nextInt());
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
