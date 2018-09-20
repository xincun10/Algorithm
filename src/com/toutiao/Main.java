package com.toutiao;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int number = scan.nextInt();
			Set<Integer> set = new TreeSet<>();
			int dif = scan.nextInt();
			for(int i=0; i<number; i++)
			{
				set.add(scan.nextInt());
			}
			Iterator it = set.iterator();
			int count = 0;
			while(it.hasNext())
			{
				int tmp = (int) it.next();
				if(set.contains(tmp+dif))
					count++;
			}
			System.out.println(count);
		}
	}
}
