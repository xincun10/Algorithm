package com.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] arr = str.toCharArray();
		for(char c:arr)
		{
			if(!shouldCount(c))
				continue;
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
	        //…˝–Ú≈≈–Ú
	        public int compare(Entry<Character, Integer> o1,
	                Entry<Character, Integer> o2) {
	        	if(o1.getValue() != o2.getValue())
	        		return o2.getValue().compareTo(o1.getValue());
	        	else
	        		return 1;
	        }
	        
	    });
		list.forEach(item -> System.out.println(item.getKey()+"="+item.getValue()));
	}
	
	private static boolean shouldCount(char c) {
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			return true;
		else
			return false;
	}
}
