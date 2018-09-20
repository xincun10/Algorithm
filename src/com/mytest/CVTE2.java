package com.mytest;

import java.util.*;

public class CVTE2 {
	
	private static List<String> list = new ArrayList<>();
	private static int length;
	public static void main(String[] args) {
		sequence("CVT");
	}

	public static List<String> sequence(String str)
	{
		Set<String> set = new HashSet<>();
		for(int i=0; i<str.length(); i++)
		{
			set.add(str.substring(i, i+1));
		}
		List<String> list2 = new ArrayList<>(set);
		length = list2.size();
		listAll(list2, "");
		System.out.println(list);
		return list;
	}

	private static void listAll(List<String> set, String prefix) {
		if(prefix.length()==length)
			list.add(prefix);
		for(int i=0; i<set.size(); i++)
		{
			List<String> tmp = new LinkedList<>(set);
			listAll(tmp, prefix+tmp.remove(i));
		}
	}

}
