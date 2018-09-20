package com.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RecordError {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> map = new LinkedHashMap<>();
		
		while(in.hasNext())
		{
			String str = in.nextLine();
			String filename = str.substring(str.lastIndexOf("\\")+1, str.lastIndexOf(" "));
			if(filename.length() > 16)
			{
				filename = filename.substring(filename.length()-16);
			}
			String key = filename + str.substring(str.lastIndexOf(" "));
			if(!map.containsKey(key))
			{
				map.put(key, 1);
			}
			else
			{
				int num = map.get(key) + 1;
				map.put(key, num);
			}
		}
		
		//对map按值排序
		//先转换为list
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		//排序
		Collections.sort(list, (Entry<String, Integer> o1, Entry<String, Integer> o2)->(o2.getValue().compareTo(o1.getValue())));
		//输出
		int count = 1;
		for(Map.Entry<String,Integer> mapping:list)
		{ 
            System.out.println(mapping.getKey()+" "+mapping.getValue()); 
            if(++count > 8)
            {
            	break;
            }
		}
	}
}