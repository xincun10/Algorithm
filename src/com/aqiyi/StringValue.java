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
 * ��һ����Ȥ���ַ�����ֵ���㷽ʽ:ͳ���ַ�����ÿ���ַ����ֵĴ���,Ȼ���������ַ�������ƽ������Ϊ�ַ����ļ�ֵ
 * ����: �ַ���"abacaba",�������4��'a',2��'b',1��'c',��������ַ����ļ�ֵΪ4 * 4 + 2 * 2 + 1 * 1 = 21
 * ţţ��һ���ַ���s,�����������s���Ƴ����k���ַ�,���Ŀ�����õõ����ַ����ļ�ֵ��С��
 * 
 * ʹ�����ȶ���PriorityQueue
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
			//��map�ļ�ֵ�Է���set��������
			Set<Entry<Character, Integer>> entrys = map.entrySet();
			//����Ƚ���
			Comparator<Entry<Character, Integer>> comparator = new Comparator<Entry<Character, Integer>>() {
				public int compare(Entry<Character, Integer> e1, Entry<Character, Integer>e2)
				{
					return e2.getValue()-e1.getValue();
				}
			};
			//�������ȶ��У���map���ϵĳ��Ⱥ��Զ���Ƚ�����ʼ��
			PriorityQueue<Entry<Character, Integer>> pq = new PriorityQueue<>(map.size(), comparator);
			//��map������entry�������ȶ���
			pq.addAll(entrys);
			
			//ÿ�δӶ�ͷȡ����Ŀ�����ַ���������Ŀ��һ�ٷŻ����ȶ���
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
