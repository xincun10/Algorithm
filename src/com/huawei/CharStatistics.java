package com.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
/*
 * TreeSet��ֵ����
 * ���ַ��еĸ���Ӣ���ַ�����Сд�ֿ�ͳ�ƣ������֣��ո����ͳ�ƣ�
 * ������ͳ�Ƹ����ɶൽ�����,���ͳ�Ƶĸ�����ͬ������ASII����С����������� ��
 * ����������ַ��������Щ�ַ����ý���ͳ�ơ�
 */
public class CharStatistics {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Map<Character, Integer> map = new TreeMap<>();
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
		
		Collections.sort(list, (Entry<Character, Integer> o1, Entry<Character, Integer> o2) -> (o2.getValue().compareTo(o1.getValue())));
		list.forEach(item -> System.out.print(item.getKey()));
		System.out.println();
	}

	private static boolean shouldCount(char c) {
		if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c==' ') || (c>='0' && c<='9'))
			return true;
		else
			return false;
	}
}


//number 1����
class Number1
{
	private static String fun(String str) {
		char[] chs=str.toCharArray();
		int[] num=new int[200];     //�������128
		//����ascii���˳��洢�ַ�����
	    for (char c : chs) {
	        int i=(int)c;
	        num[i]++;
	    }
	       
	    int max=0;
	    for(int i=0;i<num.length;i++){
	        if(max<num[i]){
	            max=num[i];
	        }
	    }
	       
	    StringBuffer sb=new StringBuffer();
	    //������ַ�������ʼ�����maxһֱδ������ַ��е����ֵ
	    while(max!=0){
	        for(int i=0;i<num.length;i++){
	            if(max==num[i]){
	                sb.append((char)i);
	            }
	        }
	        max--;
	    }
	    return sb.toString();
	}
}
