package com.test.baidu;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 * 17�ٶ���ñ��
 * �ȶ�����ȥ�̳���һ��ñ�ӣ��̳�����N��ñ�ӣ���Щñ�ӵļ۸������ͬ��
 * �ȶ�������һ���۸�������˵�ñ�ӣ��ʵ������˵�ñ�Ӽ۸��Ƕ��٣� 
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
