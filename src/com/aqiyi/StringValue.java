package com.aqiyi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

/*
 * 有一种有趣的字符串价值计算方式:统计字符串中每种字符出现的次数,然后求所有字符次数的平方和作为字符串的价值
 * 例如: 字符串"abacaba",里面包括4个'a',2个'b',1个'c',于是这个字符串的价值为4 * 4 + 2 * 2 + 1 * 1 = 21
 * 牛牛有一个字符串s,并且允许你从s中移除最多k个字符,你的目标是让得到的字符串的价值最小。
 * 
 * 使用优先队列PriorityQueue
 */
public class StringValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			char[] items = scan.nextLine().toCharArray();
			int num = scan.nextInt();
			HashMap<Character, Integer> map = new HashMap<>();
			for(char c:items)
			{
				if(map.containsKey(c))
				{
					map.put(c, map.get(c)+1);
				}
				else
				{
					map.put(c, 1);
				}
			}
			//将map的键值对放入set集合里面
			Set<Entry<Character, Integer>> entrys = map.entrySet();
			//定义比较器
			Comparator<Entry<Character, Integer>> comparator = new Comparator<Entry<Character, Integer>>() {
				public int compare(Entry<Character, Integer> e1, Entry<Character, Integer>e2)
				{
					return e2.getValue()-e1.getValue();
				}
			};
			//定义优先队列，以map集合的长度和自定义比较器初始化
			PriorityQueue<Entry<Character, Integer>> pq = new PriorityQueue<>(map.size(), comparator);
			//把map的所有entry放入优先队列
			pq.addAll(entrys);
			
			//每次从队头取出数目最大的字符，将其数目减一再放回优先队列
			while(num>0)
			{
				Entry<Character, Integer> item = pq.poll();
				item.setValue(item.getValue()-1);
				pq.add(item);
				num--;
			}
			Iterator<Entry<Character, Integer>> it = pq.iterator();
			int sum = 0;
			while(it.hasNext())
			{
				int tmp = it.next().getValue();
				sum += Math.pow(tmp, 2);
			}
			System.out.println(sum);
		}
	}
}
