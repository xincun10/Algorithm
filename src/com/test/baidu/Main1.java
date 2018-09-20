package com.test.baidu;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 * 17百度买帽子
 * 度度熊想去商场买一顶帽子，商场里有N顶帽子，有些帽子的价格可能相同。
 * 度度熊想买一顶价格第三便宜的帽子，问第三便宜的帽子价格是多少？ 
 * @author Administrator
 *
 */
public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int num = scan.nextInt();
			int[] arr = new int[num];
			for(int i=0; i<num; i++)
			{
				arr[i] = scan.nextInt();
			}
			Set<Integer> set = new TreeSet<>();
			for(int a:arr)
			{
				set.add(a);
			}
			Iterator iter = set.iterator();
			int i = 0;
			while(iter.hasNext())
			{
				Integer res = (Integer) iter.next();
				i++;
				if(i==3)
				{
					System.out.println(res);
					break;
				}
			}
			if(i<3)
			{
				System.out.println(-1);
			}
		}
	}
}
