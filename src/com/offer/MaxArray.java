package com.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MaxArray {
	public String PrintMinNumber(int [] numbers) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<numbers.length; i++)
		{
			list.add(numbers[i]);
		}
		
		Collections.sort(list, new Comparator<Integer>() {
	
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String str1 = o1 + "" + o2;
				String str2 = o2 + "" + o1;
				return str1.compareTo(str2);
			}
			
		});
		String str = "";
		for(int item: list)
		{
			str += item;
		}
		return str;
	}
}
